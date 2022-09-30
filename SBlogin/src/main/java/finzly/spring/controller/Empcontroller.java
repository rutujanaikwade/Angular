package finzly.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finzly.spring.entity.Employee;
import finzly.spring.service.Empservice;

@RestController
public class Empcontroller {

	@Autowired(required=true)
	private Empservice service;
	
	@RequestMapping("Show")
	public String print() {
		return"Start";
	}

	@GetMapping("getEmp")
	public List<Employee> findAllEmp(){
		return service.getEmp();
	}

//	
//	@GetMapping("/employee")
//	
//	public String listAll(Employee employee) {
//		List<Employee> listEmployee = emp.findAll();
//		//employee.add
//		return 
//	}
}
