package com.empo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empo.Entity.Employee;

@Service

public interface EmpService {

	Employee createEmployee(Employee employee);

	List<Employee> getEmpoyee();

	boolean deleteEmp(Long iD);

	Employee  update(Long id,String firstName,String lastName,String email);

	Employee getempbyid(Long id);


}
