package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class JobTitleController {
	@GetMapping("/jobTitles")
	public String getjobtitle()
	{
		return "JobTitle";
	}

}
