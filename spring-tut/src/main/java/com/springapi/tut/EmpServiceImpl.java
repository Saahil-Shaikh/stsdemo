package com.springapi.tut;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

	List<Employee> emp;
	
	public EmpServiceImpl() {
		emp = new ArrayList<Employee>();
		emp.add(new Employee(1,"Saahil",10000));
		emp.add(new Employee(2,"Dinesh",50000));
		emp.add(new Employee(3,"Vaishali",90000));
		emp.add(new Employee(4,"Rajat",30000));
	}
	
	@Override
	public List<Employee> getEmp() {
		
		return emp;
	}

	@Override
	public Employee getId(int id) {
		
		Employee e1 = null;
		for(Employee employees: emp) {
			if(employees.getId()==id) {
				e1 = employees;
				break;
			}
		}
		
		return e1;
	}

}
