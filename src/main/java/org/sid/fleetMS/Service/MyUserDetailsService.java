package org.sid.fleetMS.Service;
import org.sid.fleetMS.Dao.UserRepository;
import org.sid.fleetMS.Model.User;
import org.sid.fleetMS.Model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService  implements UserDetailsService  {
	@Autowired UserRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username);
			
			if(user == null) {
				throw new UsernameNotFoundException("User not found!");
			}
			
			return  new UserPrincipal(user);
	}

}
