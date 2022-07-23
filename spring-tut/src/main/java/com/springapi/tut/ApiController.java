package com.springapi.tut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	
	@GetMapping("/home") public String home() { return "This is home page!"; }
	 
	
	@Autowired
	private EmpService empservice;
	
	//get employee
	@GetMapping("/emp")
	public List<Employee> getEmployee(){
		
		return this.empservice.getEmp();		
	}
	
	//get specific employee with id
	@GetMapping("/emp/{id}")
	public Employee getOneEmployee(@PathVariable String id){
		
		return this.empservice.getId(Integer.parseInt(id));		
	}
 
}
