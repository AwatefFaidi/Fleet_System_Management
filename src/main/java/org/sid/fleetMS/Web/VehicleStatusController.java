package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class VehicleStatusController {
	@GetMapping("/vehiclestatuses")
	public String getvehiclestatus()
	{
		return "VehicleStatus";
	}

}
