package com.example.mapper;

import com.example.dto.EmployeeDto;
import com.example.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirsName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }
}
