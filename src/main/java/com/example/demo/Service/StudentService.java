package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService 

{
	@Autowired(required=true)
	StudentRepo stRepo;
	
	public StudentDemo saveDetails(StudentDemo e)
	{
		return stRepo.save(e);
	}
	public List<StudentDemo> gatDetails(){
		return stRepo.findAll();
	}

} 