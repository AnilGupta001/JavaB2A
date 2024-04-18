package com.empo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.service.annotation.DeleteExchange;

import com.empo.Entity.Employee;
import com.empo.Service.EmpService;

import jakarta.annotation.PostConstruct;
import net.sf.jsqlparser.statement.update.Update;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping
public class EmpController {
@Autowired
private final EmpService empService;
public EmpController(EmpService empService) {
	this.empService=empService;
}
@PostMapping("/emp")
public Employee createEmployee(@RequestBody Employee employee) {
	empService.createEmployee(employee);
	return employee;
}
@GetMapping("/emp")
public List<Employee> getEmployee(){
	return empService.getEmpoyee();
}
@DeleteMapping("/emp/{id}")
public ResponseEntity<Map<String, Boolean>> delete(@PathVariable Long id) {
boolean delete=false;
delete=empService.deleteEmp(id);
Map<String, Boolean> resMap=new HashMap<>();
resMap.put("Deleted", delete);
return ResponseEntity.ok(resMap);

}
@PutMapping("/emp/{id}")
public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody String firstName, @RequestBody String lastName,@RequestBody String email) {
    Employee employee = empService.update(id, firstName, lastName,email);
    return ResponseEntity.ok(employee);
}
@GetMapping("/emp/{id}")
public ResponseEntity<Employee> getEmpoyee(@PathVariable Long id){
	Employee employee=null;
	employee=empService.getempbyid(id);
	return ResponseEntity.ok(employee);
}

}