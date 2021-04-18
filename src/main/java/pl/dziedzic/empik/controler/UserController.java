package pl.dziedzic.empik.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dziedzic.empik.dto.UserDto;
import pl.dziedzic.empik.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{login}")
	UserDto div(@PathVariable(name = "login") String login) {
		return userService.getUserByLogin(login);
	}

}
