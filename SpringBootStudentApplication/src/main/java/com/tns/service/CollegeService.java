package com.tns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.entity.College;
import com.tns.repository.CollegeRepository;

@Service
@Transactional
public class CollegeService {
	
	@Autowired
	private CollegeRepository repo;
	
	public List<College> allColleges()
	{
		return repo.findAll();
	}
	
	public void save(College college)
	{
		repo.save(college);
	}
}
