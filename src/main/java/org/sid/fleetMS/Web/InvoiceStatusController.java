package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InvoiceStatusController {
	@GetMapping("/invoiceStatuses")
	public String getstatusinvoice()
	{
		return "InvoiceStatus";
	}

}
