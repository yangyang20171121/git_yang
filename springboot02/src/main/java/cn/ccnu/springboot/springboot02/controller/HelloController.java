package cn.ccnu.springboot.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello yangyang!  come on ";
    }



    //查出一些数据在页面显示

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        //classpath/templates/sucess.html
        map.put("hello","<h1>yangyang</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

//    @RequestMapping({"/","/index.html"})
//    //classpath/templates/index.html
//    public String index(){
//        return "index";
//    }

//    @RequestMapping("/dashboard.html")
////    public String dashboard(){
////        return "dashboard";
////    }
    @RequestMapping("/404.html")
    public String four(){
        return "404";
    }
    @RequestMapping("/list.html")
    public String list(){
        return "list";
    }
}
