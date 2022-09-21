package com.fx.service;

import com.fx.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
