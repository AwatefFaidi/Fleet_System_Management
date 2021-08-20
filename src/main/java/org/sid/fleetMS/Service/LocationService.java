package org.sid.fleetMS.Service;
import java.util.List;
import java.util.Optional;

import org.sid.fleetMS.Dao.CountryRepository;
import org.sid.fleetMS.Dao.LocationRepository;
import org.sid.fleetMS.Model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
	
	//Return list of locations
	public List<Location> getLocations(){
		return locationRepository.findAll();
	}
	
	//Add new location
	public void save( Location location){
		
		locationRepository.save(location);
		}
	
   //Get by id
	public Optional<Location> findById(Integer id ) {
		return locationRepository.findById(id);
	}
	
	//DELETE 
	public void delete(Integer id) {
		locationRepository.deleteById(id);
	}
}
