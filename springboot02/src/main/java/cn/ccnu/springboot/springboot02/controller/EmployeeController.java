package cn.ccnu.springboot.springboot02.controller;

import cn.ccnu.springboot.springboot02.dao.DepartmentDao;
import cn.ccnu.springboot.springboot02.dao.EmployeeDao;
import cn.ccnu.springboot.springboot02.entities.Department;
import cn.ccnu.springboot.springboot02.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    //到列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees =employeeDao.getAll();
        model.addAttribute("emps",employees);
        //thymeleaf 拼串
        // classpath:/templates/ xxx.html
        return "emp/list";
    }
    //跳转到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //获取部门信息显示在页面
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        // classpath:/templates/ xxx.html
        return "emp/add";
    }

    //添加员工
    @PostMapping("/emp")
    //SpringMVC自动将请求参数和入参对象的属性一一绑定要求：请求参数名字和JavaBean入参对象属性名一致
    public String addEmp(Employee employee){
        System.out.println("保存的员工信息"+employee);
        //保存员工，并没有真正的保存数据，why？
        employeeDao.save(employee);

        //重定向到员工列表页面 发/emps请求 /代表当前项目路径
        return "redirect:/emps";
    }

    //修改员工
    //来到员工修改页面，并回显信息
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") int id,Model model){
        //修改和添加页面二合一
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //添加所有的部门信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        //重定向到员工列表页面
        return "redirect:/emps";
    }
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") int id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
