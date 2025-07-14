package com.javaproject.services.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javaproject.services.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findByDepartmentId(String departmentId);

    List<Employee> findByOrganizationId(String organizationId);

}
