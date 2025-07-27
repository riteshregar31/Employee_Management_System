package net.myproject.ems.service;
import java.util.List;

import net.myproject.ems.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getALlEmployees();
    EmployeeDto updataEmployee(Long employeeId,EmployeeDto updatedEmployee);

    void deleteEmployeeById(Long employeeId);
}
