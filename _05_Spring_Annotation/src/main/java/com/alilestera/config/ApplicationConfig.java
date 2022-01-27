package com.alilestera.config;

import com.alilestera.domain.Person;
import com.alilestera.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Alilestera
 * @date 1/24/2022
 */
@Configuration
@ComponentScan(basePackages = "com.alilestera")
@PropertySource("something.properties")
public class ApplicationConfig {

    @Value("${student.name}")
    private String name;
    @Value("${student.sex}")
    private String sex;
    @Value("${student.age}")
    private int age;
    @Value("${student.id}")
    private String id;
    @Value("${student.favoriteSubject}")
    private String favoriteSubject;
    @Value("${student.favoriteTeacher}")
    private String favoriteTeacher;

    @Bean("student")
    public Student getStudent() {
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        student.setId(id);
        student.setFavoriteSubject(favoriteSubject);
        student.setFavoriteTeacher(favoriteTeacher);
        return student;
    }
}
