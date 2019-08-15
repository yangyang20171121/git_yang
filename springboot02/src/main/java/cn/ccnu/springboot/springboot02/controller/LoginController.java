package cn.ccnu.springboot.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String passWord,
                        Map<String,Object> map, HttpSession session){
        //用户名不为空，密码为123456，跳转到首页
        if(!StringUtils.isEmpty(userName) && "123456".equals(passWord)){
            //成功以后，防止多次提交，可以使用重定向
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
            // "/main.html"在视图映射器里面设置映射到了dashboardhtml页面
            //不加拦截器的话，在浏览器就可以通过localhost:8080/mian.html直接访问到dashboard.thml了
            //那么登录页面就没有意义


        }else{
            //用户名，密码错误，显示提示信息，留在登录页面
            map.put("msg","用户名或密码错误");
            return "index";
        }

    }
}
