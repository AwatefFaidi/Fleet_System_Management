package org.sid.fleetMS.Service;
import org.sid.fleetMS.Dao.CountryRepository;
import org.sid.fleetMS.Model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//Add new country
	public void save( Country country){
		
			 countryRepository.save(country);
		}
	
   //Get by id
	public Optional<Country> findById(Integer id ) {
		return countryRepository.findById(id);
	}
	
	//DELETE 
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
	
}
