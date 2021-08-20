package org.sid.fleetMS.Service;
import java.util.List;
import java.util.Optional;

import org.sid.fleetMS.Dao.CountryRepository;
import org.sid.fleetMS.Dao.StateRepository;
import org.sid.fleetMS.Model.Country;
import org.sid.fleetMS.Model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
	
	//Return list of countries
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	//Add new country
	public void save( State state){
		
		stateRepository.save(state);
		}
	
   //Get by id
	public Optional<State> findById(Integer id ) {
		return stateRepository.findById(id);
	}
	
	//DELETE 
	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}

}
