package com.etechon.restful.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.etechon.restful.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//Employee findOne(Long empid);

}
