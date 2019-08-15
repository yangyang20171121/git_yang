package cn.ccnu.springboot.springboot02.config;



import cn.ccnu.springboot.springboot02.component.LoginHandlerInterceptor;
import cn.ccnu.springboot.springboot02.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc   不要接管SpringMVC
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {



//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//       // super.addViewControllers(registry);
//        //浏览器发送 /atguigu 请求来到 success
//        registry.addViewController("/atguigu").setViewName("success");
//    }

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
                /**
                 * spring1.x addPathPatterns("/**")，且不用自己排除静态资源
                 * spring2.x 会拦截静态资源，把addPathPatterns("/**") 改为addPathPatterns("/*"),
                 * 并排除/staticspring2.x 会拦截静态资源，把addPathPatterns("/**") 改为addPathPatterns("/*"),
                 * 并排除"/static/**"
                 */


               registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/*")
                       .excludePathPatterns("/index.html","/","/user/login","/static/**");

            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }

}
