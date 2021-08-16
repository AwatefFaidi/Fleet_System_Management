package org.sid.fleetMS.Web;
import java.util.List;
import java.util.Optional;

import org.sid.fleetMS.Model.Country;
import org.sid.fleetMS.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("")
	public String getCountries(Model model) {		
		List<Country> countryList = countryService.getCountries();	
		model.addAttribute("countries", countryList);	
		return "country";
	}	
	
	@PostMapping("/addNew")
	public String saveCountry(Country country ) {		
		countryService.save(country);
		return "redirect:/countries";
	}	
	
	@RequestMapping("/findById")
	@ResponseBody
	public Optional<Country> findById(int id) {
	  return countryService.findById(id);	
	}	

	@RequestMapping(value="/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
