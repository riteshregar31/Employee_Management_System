package net.myproject.ems.controller;
import java.util.List;

import lombok.AllArgsConstructor;
import net.myproject.ems.dto.EmployeeDto;
import net.myproject.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
private EmployeeService employeeService;

@PostMapping
public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
    EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
}

@GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
    EmployeeDto employeeByIdDto = employeeService.getEmployeeById(employeeId);
    return ResponseEntity.ok(employeeByIdDto);

}
@GetMapping
ResponseEntity<List<EmployeeDto>> getAllEmployees(){
    List<EmployeeDto> employees=employeeService.getALlEmployees();
    return ResponseEntity.ok(employees);
}

@PutMapping("{id}")
ResponseEntity<EmployeeDto> updateEmployee (@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
    EmployeeDto employeeDto=employeeService.updataEmployee(employeeId,updatedEmployee);
    return ResponseEntity.ok(employeeDto);
}

}
