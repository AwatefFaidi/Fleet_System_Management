package org.sid.fleetMS.Web;

import java.util.List;
import java.util.Optional;

import org.sid.fleetMS.Model.*;
import org.sid.fleetMS.Service.CountryService;
import org.sid.fleetMS.Service.LocationService;
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
@RequestMapping("/locations")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	
	  @GetMapping("")
	   public String getStates(Model model) {	
	        List<State> stateList = stateService.getStates();	
			List<Country> countryList = countryService.getCountries();
			List<Location> locationList = locationService.getLocations();
			
			model.addAttribute("countries", countryList);
			model.addAttribute("locations", locationList);	
			model.addAttribute("states", stateList);
			return "location";
		}	
		
		@PostMapping("/addNew")
		public String addNew(Location location) {
			locationService.save(location);
			return "redirect:/locations";
		}
		
		@RequestMapping("/findById")
		@ResponseBody
		public Optional<Location> findById(int id) {
		  return locationService.findById(id);	
		}	
		
		@RequestMapping(value="/update", method= {RequestMethod.PUT, RequestMethod.GET})
		public String update(Location location) {
			locationService.save(location);
			return "redirect:/locations";
		}
		
		@RequestMapping(value="/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
		public String delete(Integer id) {
			locationService.delete(id);
			return "redirect:/locations";
		}

}
