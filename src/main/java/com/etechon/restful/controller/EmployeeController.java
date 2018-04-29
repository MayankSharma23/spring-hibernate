package com.etechon.restful.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etechon.restful.Model.Employee;
import com.etechon.restful.Services.EmployeeService;

@RestController
@RequestMapping("/etechon")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 
	 * @return Simple Hello Message.
	 */
	@RequestMapping("/hello")
	public String sayhi() {
		return "Hello Folks";
	}
	
	/**
	 *  @return to save an employee
	 */
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return new ResponseEntity<Employee>(employee , HttpStatus.CREATED);
	}
	/**
	 * @author Mayank
	 * @return The list of all Employee exists in database
	 * 			otherwise print error message like "NOT_FOUND"
	 */
	
	@GetMapping("/getallemployee")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = employeeService.findAll();
		if(employees.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.FOUND);
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long id ,@RequestBody Employee employee){
		Employee emp = employeeService.getOne(id);
		if(emp == null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		emp.setName(employee.getName());
		emp.setEmailid(employee.getEmailid());
		 
		emp = employeeService.save(emp);
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}

	/**
	 * 
	 * @param id
	 * @return Delete Employee on the basis of id
	 */
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable("id") Long id){
		Employee employee = employeeService.getOne(id);
		if(employee== null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(HttpStatus.GONE);
	}
}
