package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class VehicleController {
	@GetMapping("/vehicles")
	public String getvehicle()
	{
		return "Vehicle";
	}
}
