package com.snow.mapper;


import com.snow.DemoCrm1ApplicationTests;
import com.snow.entity.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentMapperTest extends DemoCrm1ApplicationTests {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Test
    public void getDepartmentList(){
        List<Department> departmentList = departmentMapper.getDepartmentList();
        System.out.println(departmentList);
    }
    @Test
    public void getDepartmentByDeptId_(){
        Department departmentByDeptId = departmentMapper.getDepartmentByDeptId_(1);
        System.out.println(departmentByDeptId);

    }


}