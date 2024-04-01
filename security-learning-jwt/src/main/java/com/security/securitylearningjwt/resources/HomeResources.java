package com.security.securitylearningjwt.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.securitylearningjwt.models.AuthenticationRequest;
import com.security.securitylearningjwt.models.AuthenticationResponse;
import com.security.securitylearningjwt.services.MyUserDetailService;
import com.security.securitylearningjwt.util.JwtUtil;

@RestController
public class HomeResources {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private MyUserDetailService userDetailService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
		try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername()	
				, authenticationRequest.getPassword()));
		} catch(BadCredentialsException e) {
			throw new Exception("Incorrect username/password", e);
		}
		
		final UserDetails userDetails = userDetailService.loadUserByUsername(authenticationRequest.getUsername());
		
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

}
