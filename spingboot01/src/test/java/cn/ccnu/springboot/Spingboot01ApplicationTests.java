package cn.ccnu.springboot;

import cn.ccnu.springboot.bean.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.ApplicationContextAssert;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Spingboot01ApplicationTests {
    @Autowired
    People people;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean bool=ioc.containsBean("helloService");
        System.out.println(bool);
    }


    @Test
    public void contextLoads() {
        System.out.println(people);
    }

}
