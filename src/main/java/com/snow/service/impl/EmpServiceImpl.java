package com.snow.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.snow.dto.Page;
import com.snow.entity.Employee;
import com.snow.mapper.EmployeeMapper;
import com.snow.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);

    }

    @Override
    public void deleteEmployeeByEmpId(Integer empId) {
        employeeMapper.deleteEmployeeByEmpId(empId);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public Page<Employee> getEmployeeList(int pageNo,int pageSize) {
        Page<Employee> page = new Page<>();
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        PageInfo<Employee> info = new PageInfo<>(employeeList);
        page.setPage(info.getList());
        page.setPageCount(info.getPages());
        page.setPageNo(info.getPageNum());
        page.setHasNext(info.isHasNextPage());
        page.setHasPre(info.isHasPreviousPage());

        return page;
    }

    @Override
    public Employee getEmployeeByEmpId(Integer empId) {
        return employeeMapper.getEmployeeByEmpId(empId);
    }
}
