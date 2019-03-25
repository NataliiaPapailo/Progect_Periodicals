package ua.lviv.lgs.periodicals.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.periodicals.dao.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	public void save (User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		//userRepository.save(user);
	}
	
}
