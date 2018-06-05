package com.example.firstspringdata.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.firstspringdata.entities.Student;

public interface StudentRepository extends MongoRepository <Student, String> { //Entidade e tipo do Id no extends
	
	public List<Student> findByNameLikeIgnoreCase(String name); //Isso é do SpringData
}
