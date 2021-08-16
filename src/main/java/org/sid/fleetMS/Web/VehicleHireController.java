package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class VehicleHireController {
	@GetMapping("/vehiclehires")
	public String getvehiclehire()
	{
		return "VehicleHire";
	}

}
