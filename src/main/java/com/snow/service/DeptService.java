package com.snow.service;

import com.snow.entity.Department;

import java.util.List;

public interface DeptService {

    /**
     * 获取部门列表
     * @return
     */
    List<Department> getDepartmentList();
}
