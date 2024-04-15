package com.empo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empo.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long>{

}
