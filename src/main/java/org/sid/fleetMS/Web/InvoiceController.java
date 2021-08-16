package org.sid.fleetMS.Web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class InvoiceController {
	@GetMapping("/invoices")
	public String getcountry()
	{
		return "Invoice";
	}
}
