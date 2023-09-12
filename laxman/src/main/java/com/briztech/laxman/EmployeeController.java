package com.briztech.laxman;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository erepo;
	@RequestMapping("/all")
	public List<Employee> alldata()
	{
	return erepo.findAll();
	}
	@RequestMapping("/id/{id}")
	public Optional<Employee> byAge(@PathVariable int age)
{
	return erepo.findById(age);
}
}		
		