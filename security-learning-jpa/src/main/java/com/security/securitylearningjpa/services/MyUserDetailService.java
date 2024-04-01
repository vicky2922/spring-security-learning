package com.security.securitylearningjpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.securitylearningjpa.models.MyUserDetails;
import com.security.securitylearningjpa.models.User;
import com.security.securitylearningjpa.repos.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByUserName(userName);
		user.orElseThrow(() -> new UsernameNotFoundException("NOT FOUND "+userName));
		//UserDetails usd = new MyUserDetails(user.get());
		return user.map(MyUserDetails::new).get();
	}

}
