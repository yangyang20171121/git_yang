package cn.ccnu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中每个属性的值，映射到这个组件中
 *@ConfigurationProperties 注解告诉SpringBoot将该类中的属性的值和配置文件中的配置信息进行绑定，
 * prefix = "people" 指明配置文件哪个下的属性进行一一映射
 * @ConfigurationProperties默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，所以加上@Component注解
 */
@Component
@ConfigurationProperties(prefix = "people")
public class People {
    private String lastName;
    private int age;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", mps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
