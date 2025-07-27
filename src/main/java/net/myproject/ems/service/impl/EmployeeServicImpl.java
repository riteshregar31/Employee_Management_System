package net.myproject.ems.service.impl;

import lombok.AllArgsConstructor;
import net.myproject.ems.dto.EmployeeDto;
import net.myproject.ems.entity.Employee;
import net.myproject.ems.exception.ResourceNotFoundException;
import net.myproject.ems.mapper.EmployeeMapper;
import net.myproject.ems.repository.EmployeeRepository;
import net.myproject.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServicImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee  savedEmployee= employeeRepository.save(employee);

        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("employee does not exist with given id" + employeeId));
        return EmployeeMapper.maptoEmployeeDto(employee);
    }

}
