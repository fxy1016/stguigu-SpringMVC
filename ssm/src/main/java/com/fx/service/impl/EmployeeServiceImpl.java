package com.fx.service.impl;

import com.fx.mapper.EmployeeMapper;
import com.fx.pojo.Employee;
import com.fx.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> list = employeeMapper.getAllEmployee();
        PageInfo<Employee> page = new PageInfo<>(list,5);
        return page;
    }
}
