package cn.ccnu.springboot;

import cn.ccnu.springboot.bean.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spingboot01ApplicationTests {
    @Autowired
    People people;

    @Test
    public void contextLoads() {
        System.out.println(people);
    }

}
