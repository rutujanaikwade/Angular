package finzly.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import finzly.spring.dao.Empdao;
import finzly.spring.entity.Employee;


@Service
public class Empservice {
	
	
	@Autowired
	private Empdao empd;
	
	public Employee save(Employee employee) {
		return empd.save(employee);
	}
	
	public  List<Employee> saveEmp(List<Employee> employee) {
		return empd.saveAll(employee);
	}
	
	public List<Employee> getEmp(){
		return empd.findAll();
	}

}
