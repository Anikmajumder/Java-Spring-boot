package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployeeDto(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
