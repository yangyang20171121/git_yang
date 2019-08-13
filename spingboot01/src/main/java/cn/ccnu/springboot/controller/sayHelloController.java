package cn.ccnu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHelloController {
    //@Value()从配置文件中取值
    @Value("${people.lastName}")
    private String name;

    @RequestMapping("/sayhello")
    public String sayHello(){
        return "hello "+name;
    }
}
