package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@RequestMapping("/user/read")
	public User user(@RequestParam long id) {
		return new User(id, "abc", "123");
	}
}
