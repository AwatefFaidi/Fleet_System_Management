package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EmployeeController {
	@GetMapping("/employees")
	public String getemployees()
	{
		return "Employee";
	}

}
