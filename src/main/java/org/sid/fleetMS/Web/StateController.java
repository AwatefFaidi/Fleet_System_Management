package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class StateController {
	@GetMapping("/states")
	public String getstate()
	{
		return "State";
	}

}
