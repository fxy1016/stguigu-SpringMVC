package com.fx.mapper;

import com.fx.pojo.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EmployeeMapper {
    List<Employee> getAllEmployee();
}
