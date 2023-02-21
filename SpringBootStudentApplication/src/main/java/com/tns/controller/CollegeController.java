package com.tns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.entity.College;
import com.tns.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	private CollegeService service;
	
	@GetMapping("/colleges")
	public List<College> allColleges()
	{
		return service.allColleges();
	}
	@PostMapping("/colleges")
	public void save(@RequestBody College college)
	{
		service.save(college);
	}
	
}
