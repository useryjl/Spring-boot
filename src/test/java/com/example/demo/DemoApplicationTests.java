package com.example.demo;

import com.example.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest //Spring boot 的单元测试
public class DemoApplicationTests {
    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    ApplicationContext ac;

    @Test
    public void hello(){
        boolean b;
        b= ac.containsBean("helloworld");
        System.out.println(b);
    }
}
