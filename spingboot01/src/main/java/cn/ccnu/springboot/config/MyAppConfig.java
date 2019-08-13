package cn.ccnu.springboot.config;

import cn.ccnu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 表明该类是一个配置类，来代替之前的Spring配置文件
 * Spring配置文件使用<bean></bean>的方式
 */
@Configuration
public class MyAppConfig {
    /**
     * @Bean 将方法的返回值添加到容器，并且id是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("通过@Configuration给容器配置了组件");
        return new HelloService();
    }
}
