package net.myproject.ems.mapper;

import net.myproject.ems.dto.EmployeeDto;
import net.myproject.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto maptoEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(employeeDto.getId(),
                employeeDto.getFirstname(),
                employeeDto.getLastname(),
                employeeDto.getEmail()
                );
    }
}
