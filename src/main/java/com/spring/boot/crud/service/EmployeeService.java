package com.spring.boot.crud.service;

import com.spring.boot.crud.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    Employee updateEmployee(Employee student);

    void deleteEmployeeById(Long employeeId);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
