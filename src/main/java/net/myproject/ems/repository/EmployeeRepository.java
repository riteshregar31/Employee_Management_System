package net.myproject.ems.repository;

import net.myproject.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends  JpaRepository<Employee,Long>{

}
