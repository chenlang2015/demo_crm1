package com.snow.mapper;

import com.snow.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    /**
     * 获取部门列表
     * @return
     */
    List<Department> getDepartmentList();

    /**
     * 根据部门ID查询部门信息
     * @param deptId
     * @return
     */
    Department getDepartmentByDeptId(Integer deptId);


    /**
     * 根据部门ID查询部门详情
     * @param deptId
     * @return
     */
    Department getDepartmentByDeptId_(Integer deptId);

}
