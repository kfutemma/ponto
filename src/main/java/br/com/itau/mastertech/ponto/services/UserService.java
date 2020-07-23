package br.com.itau.mastertech.ponto.services;

import org.springframework.stereotype.Service;

import br.com.itau.mastertech.ponto.models.User;
import br.com.itau.mastertech.ponto.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
}
