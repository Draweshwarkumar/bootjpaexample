package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.user;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
	
	 UserRepository userRepository = context.getBean(UserRepository.class);
	 
//	 user User = new user();
//	 User.setName("Shivam kumar jha");
//	 User.setCity("Darbhanga");
//	 User.setStatus("I am a java Developer");
//	 
//	 user user1 =  userRepository.save(User);
//	 
//	 System.out.println(user1);
	 
//	 user User1 = new user();
//	 User1.setName("Draweshwar kumar");
//	 User1.setCity("Patna");
//	 User1.setStatus("Java programmer");
//	 
//	 user User2 = new user();
//	 User2.setName("Pankaj kumar");
//	 User2.setCity("Chapra");
//	 User2.setStatus("Randibaaj");
 //	 
//	List<user> users =  List.of(User1,User2);
//	Iterable<user> result =  userRepository.saveAll(users);
//	 
//	result.forEach(user->{
//		System.out.println(user);
//	});
//	System.out.println("Done");
	 
//	 update the user of id 3
	 
//	Optional<user> optional = userRepository.findById(3);
//	user User =  optional.get();
//	User.setName("Ritik Dube");
//	user User1 = userRepository.save(User);
//	System.out.println(User1);
	 
//	Iterable<user> itr = userRepository.findAll();
//	itr.forEach(user->{
//		System.out.println(user);
//	});
	 
//	 Deleting the user element
	 
//	 userRepository.deleteById(2);
//	 System.out.println("Deleted");
	 
//	 Deleting multiple user
//	 
//	 Iterable<user> allusers = userRepository.findAll();
//	 allusers.forEach(user->{
//		 System.out.println(user);
//	 });
//	 userRepository.deleteAll(allusers);
	 
	 List<user> alluser = userRepository.getAlluser();
	 alluser.forEach(e->{
		 System.out.println(e);
	 });
	 System.out.println("___________________________________");
	 
	 
	 List<user> userByName = userRepository.getUserByName("Draweshwar kumar","patna");
	 userByName.forEach(e->{
		 System.out.println(e);
	 });
	 
	 
	}

}
