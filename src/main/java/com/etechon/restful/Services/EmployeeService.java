package com.etechon.restful.Services;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.etechon.restful.Model.Employee;
import com.etechon.restful.Repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * 
	 * @param emp
	 * @return It can save the Employee Model.
	 */
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	/**
	 * 
	 * @return It return all Employee from Database.
	 */
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	/**
	 * 
	 * @param id
	 * @return It can return 
	 */
	public Employee getOne(Long id) {
		return employeeRepository.getOne((Long)id);
	}

	public void delete(Serializable emp) {
		employeeRepository.deleteById((Long)emp);
	}
}
