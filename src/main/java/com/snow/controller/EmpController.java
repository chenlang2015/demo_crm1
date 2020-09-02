package com.snow.controller;

import com.snow.dto.Page;
import com.snow.entity.Department;
import com.snow.entity.Employee;
import com.snow.service.DeptService;
import com.snow.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;

    /*获取所有用户*/
    @GetMapping("/allemp")
    public String allEmpList(Integer pageNo, Integer pageSize, Model model){
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        Page<Employee> employeeList = empService.getEmployeeList(pageNo, pageSize);
        System.out.println(employeeList);
        model.addAttribute("employees",employeeList);

        return "employee_list";
    }
    /*添加页面*/
    @GetMapping("/addEmp")
    public String goAddHtml(Model model){
        List<Department> departmentList = deptService.getDepartmentList();
        model.addAttribute("depts",departmentList);
        return "employee_add";
    }

    /*添加用户*/
    @PostMapping("/insertEmp")
    public String addEmp(Employee employee){
        empService.addEmployee(employee);
        return "redirect:/allemp";
    }

    /*删除用户*/
    @GetMapping("/delemp/{empId}")
    public String delEmpById(@PathVariable("empId") Integer empId){
        empService.deleteEmployeeByEmpId(empId);
        return "redirect:/allemp";
    }
    /*更新用户页面*/
    @GetMapping("/upup")
    public String upEmp(Integer empId,Model model){
        List<Department> departmentList = deptService.getDepartmentList();
        model.addAttribute("departments",departmentList);

        Employee employeeByEmpId = empService.getEmployeeByEmpId(empId);
        model.addAttribute("emps",employeeByEmpId);
        return "employee_update";
    }

    /*更新员工信息*/
    @GetMapping("/upEmp")
    public String upupEmp(Employee employee){
        empService.updateEmployee(employee);
        return "redirect:/allemp";
    }

    /*获取分页数据*/
    @ResponseBody
    @GetMapping("/pagedata")
    public Page<Employee> getPageData(Integer pageNo,Integer pageSize){
        if (pageNo==null)
        {
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        return empService.getEmployeeList(pageNo,pageSize);
    }
}
