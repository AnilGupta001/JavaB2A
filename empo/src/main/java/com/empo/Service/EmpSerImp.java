package com.empo.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empo.Entity.Employee;
import com.empo.Repository.EmpRepo;

@Service
public class EmpSerImp implements EmpService
{
	@Autowired
private EmpRepo empRepo;
public EmpSerImp(EmpRepo empRepo) {
	this.empRepo=empRepo;
}
	
	@Override
	public Employee createEmployee(Employee employee) {
		empRepo.save(employee);
 		return employee;
	}

	@Override
	public List<Employee> getEmpoyee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public boolean deleteEmp(Long id) {
		Employee employee=empRepo.findById(id).get();
		empRepo.delete(employee);
		return true;
		
	}

	@Override
	public Employee update(Long id,String firstName,String lastName,String email) {
	Employee employee=	empRepo.findById(id).get();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	employee.setEmailId(email);
	empRepo.save(employee);
		return employee;
	}

	@Override
	public Employee getempbyid(Long id) {
		Employee employee=empRepo.findById(id).get();
		return employee;
	}

}
