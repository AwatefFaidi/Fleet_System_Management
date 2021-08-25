package org.sid.fleetMS.Web;

import java.security.Principal;
import org.springframework.stereotype.Controller;

import org.sid.fleetMS.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProfileControlle {
	
	@Autowired EmployeeService employeeservice;
	@GetMapping("/profile")
	public String profile(Model model, Principal principal) {
		String un= principal.getName();
		System.out.println(un);
		
		model.addAttribute("employee", employeeservice.findByUsername(un));
		return "profile";
	}
}
