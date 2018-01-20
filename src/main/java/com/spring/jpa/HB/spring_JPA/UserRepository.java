package com.spring.jpa.HB.spring_JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

	//User findOne(String name);
	
//	List<User> findAll();
//
//	User findOne(String name);

}
