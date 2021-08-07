package com.sistema.projecto.boot.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sistema.projecto.boot.domain.User;
import com.sistema.projecto.boot.domain.UserPrincipal;
import com.sistema.projecto.boot.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Usuario nao encontrado");
		
		}
	
	return new UserPrincipal(user);
	}
	

}
  