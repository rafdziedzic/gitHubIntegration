package pl.dziedzic.empik.mapper;

import pl.dziedzic.empik.dto.UserDto;
import pl.dziedzic.empik.model.github.GithubUser;

public class UserMapper {

	public static UserDto toDto(GithubUser githubUser, int requestCount) {
		UserDto userDto = new UserDto();
		userDto.setId(githubUser.getId());
		userDto.setLogin(githubUser.getLogin());
		userDto.setName(githubUser.getName());
		userDto.setType(githubUser.getType());
		userDto.setAvatarUrl(githubUser.getAvatar_url());
		userDto.setCreateAt(githubUser.getCreated_at());
		userDto.setCalculations(requestCount);

		return userDto;
	}

}
