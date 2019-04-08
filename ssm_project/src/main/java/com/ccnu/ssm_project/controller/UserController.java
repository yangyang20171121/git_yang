package com.ccnu.ssm_project.controller;

import com.ccnu.ssm_project.bean.User;
import com.ccnu.ssm_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/find/{id}")
    @GetMapping
    public User findUserById(@PathVariable int id){
        return userService.selectUserById(id);
    }
//    @RequestMapping("/add")
//    public Object addUser(){
//        User u=new User();
//        u.setAge(19);
//        u.setName("zhangsan");
//        u.setMoney(8000);
//        userService.addUser(u);
//        return "add sucess";
//    }
    /**
     * 动态添加用户
     */
    @RequestMapping("/insert")
    public Object insertUser(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("money") double money){

        userService.insertUser(name,age,money);
        return "add success";
    }

    /**
     * 修改用户
     */
    @RequestMapping("update/{id}")
    public Object updateUser(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("money") double money,
                             @PathVariable int id){
        userService.updateUser(name,age,money,id);
        return "update success";
    }

    /**
     * 删除用户
     */
    @RequestMapping("/delete/{id}")
    public Object deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "delete success";
    }
    /**
     * 转账
     */
    @RequestMapping("/trans/{id1}/{id2}")
    public Object transferMoney(@RequestParam("count") double count,
                                @PathVariable("id1") int id1,
                                @PathVariable("id2") int id2){

        userService.transferMoney(count, id1, id2);
        return "transfer success";

    }
}
