package pl.dziedzic.empik.service;

import static pl.dziedzic.empik.mapper.UserMapper.toDto;

import org.springframework.stereotype.Service;
import pl.dziedzic.empik.client.GithubClient;
import pl.dziedzic.empik.dto.UserDto;
import pl.dziedzic.empik.model.Calculation;
import pl.dziedzic.empik.model.github.GithubUser;
import pl.dziedzic.empik.repository.CalculationRepository;

@Service
public class UserService {

	private final GithubClient githubClient;

	private final CalculationRepository calculationRepository;

	public UserService(GithubClient githubClient, CalculationRepository calculationRepository) {
		this.githubClient = githubClient;
		this.calculationRepository = calculationRepository;
	}

	public UserDto getUserByLogin(String login) {
		GithubUser userByLogin;

		try {
			userByLogin = githubClient.getUserByLogin(login);
		} catch (Exception e) {
			return null;
		}

		int currentRequestCount = calculateRequestCount(login);

		return toDto(userByLogin, currentRequestCount);
	}

	private int calculateRequestCount(String login) {
		Calculation calculation = calculationRepository.findByLogin(login);
		int currentRequestCount = 0;
		if (calculation == null) {
			Calculation newCalculation = new Calculation();
			newCalculation.setLogin(login);
			newCalculation.setRequestCount(1);
			currentRequestCount++;
			calculationRepository.save(newCalculation);
		} else {
			currentRequestCount = calculation.getRequestCount() + 1;
			calculation.setRequestCount(currentRequestCount);
			calculationRepository.save(calculation);
		}

		return currentRequestCount;
	}

}
