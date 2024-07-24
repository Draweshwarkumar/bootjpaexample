package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.user;

public interface UserRepository extends CrudRepository<user, Integer>{
	
	public List<user> findByName(String name);
	
	public List<user> findByNameAndCity(String name,String city);
	
	@Query("select u FROM user u")
	public List<user> getAlluser();
	
	@Query("select u FROM user u WHERE u.name =:n and u.city=:c")
	public List<user> getUserByName(@Param("n") String name, @Param("c") String city);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<user> getUsers();
	
	}
