package cn.ccnu.springboot.springboot02.controller;

import cn.ccnu.springboot.springboot02.dao.EmployeeDao;
import cn.ccnu.springboot.springboot02.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;


    @GetMapping("/emps")
    public String list(Model model){
        //Collection<Employee> employees =employeeDao.getAll();
        //model.addAttribute(employees);
        //thymeleaf 拼串
        // classpath:/templates/ xxx.html
        return "emp/list";
    }
}
