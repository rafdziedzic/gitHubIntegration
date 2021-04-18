package pl.dziedzic.empik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dziedzic.empik.model.Calculation;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {

	Calculation findByLogin(String login);

}
