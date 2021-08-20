package org.sid.fleetMS.Web;

import java.util.List;
import java.util.Optional;

import org.sid.fleetMS.Model.Client;
import org.sid.fleetMS.Model.Country;
import org.sid.fleetMS.Service.ClientService;
import org.sid.fleetMS.Service.CountryService;
import org.sid.fleetMS.Service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/clients")
public class ClientController {


	@Autowired	private ClientService clientService;
	@Autowired	private CountryService countryService;
	@Autowired	private StateService stateService;


	@GetMapping("")
	public String getClients(Model model) {		
		model.addAttribute("clients", clientService.getClients());	
		
		model.addAttribute("countries", countryService.getCountries());
		
		model.addAttribute("states", stateService.getStates());

		
		return "Client";
	}	
	
	@PostMapping("/addNew")
	public String addNew(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public Optional<Client> findById(int id) {
	  return clientService.findById(id);	
	}	
	
	@RequestMapping(value="/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	
	@RequestMapping(value="/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}

}
