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

	@PostMapping("addEmp")
	public Employee addEmp(@RequestBody Employee employee) {
		return service.save(employee);
	}
	
	@GetMapping("getEmp")
	public List<Employee> findAllEmp(){
		return service.getEmp();
	}

}
