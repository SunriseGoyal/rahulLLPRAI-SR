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
	@RequestMapping("/save")
	public String savedata()
	{
	Employee e=new Employee();
		e.setName("Rahul);
		e.setCity(Ranchi);
		e.setAge(17);
		erepo.save(e);
		return "testing";
}
}		
		
