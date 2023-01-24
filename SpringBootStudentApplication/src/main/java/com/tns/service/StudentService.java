package com.tns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.entity.Student;
import com.tns.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public List<Student> allStudents()
	{
		return repo.findAll();
	}
	
	public void saveStudent(Student s)
	{
		repo.save(s);
	}
	
	public Student get(Integer rollno)
	{
		return repo.findById(rollno).get();
	}
	
	public void delete(Integer rollno)
	{
		repo.deleteById(rollno);
	}

	
}
