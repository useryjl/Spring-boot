package com.example.bean;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//只有是容器中组件才能有ConfigurationProperties

//@ConfigurationProperties(prefix ="person")
//将配置文件中的属性值映射到该组件中  前缀prefix 找配置文件中的person 进行匹配


//加载自己写的properties配置文件
//@PropertySource(value ={"classpath:person.properties"} )

@ConfigurationProperties(value = "person")
public class Person {

    private String name;

    private Integer age;

    private String email;


    @Autowired
    private Dog dog;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dog=" + dog +
                '}';
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

