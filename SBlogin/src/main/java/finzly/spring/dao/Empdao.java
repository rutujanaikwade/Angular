package finzly.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import finzly.spring.entity.Employee;

@Repository
public interface Empdao extends JpaRepository<Employee, Long> {
	

}
