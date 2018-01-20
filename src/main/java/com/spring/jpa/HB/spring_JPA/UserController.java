package com.spring.jpa.HB.spring_JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/users")
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value="/all")
	public List<User> findAll(){

		return userRepository.findAll();

	}

	@GetMapping(value="/{name}")
	public User findByName(@PathVariable final String name){

		
		return userRepository.findByName(name);

	}

	@GetMapping(value="/load/{name}")
	public User load(@PathVariable final String name){
		User user=new User();
		user.setName(name);
		userRepository.save(user);
		System.out.println("Load ::: ");
		return userRepository.findByName(user.getName());

	}


}
