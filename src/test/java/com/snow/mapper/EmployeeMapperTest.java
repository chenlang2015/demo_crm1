package com.snow.mapper;

import com.snow.DemoCrm1ApplicationTests;
import com.snow.entity.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeMapperTest extends DemoCrm1ApplicationTests {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void getEmployeeByEmpId(){
        Employee employee = employeeMapper.getEmployeeByEmpId(1001);
        System.out.println(employee);

    }
@Test
    public void getEmployeeList(){
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        System.out.println(employeeList);
    }
}
