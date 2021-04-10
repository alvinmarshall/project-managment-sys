package com.cheise_proj.projectmgtsys.domain.repository;

import com.cheise_proj.projectmgtsys.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
