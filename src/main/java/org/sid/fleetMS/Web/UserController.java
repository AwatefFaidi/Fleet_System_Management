package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
	@GetMapping("/users")
	public String getuser()
	{
		return "User";
	}

}
