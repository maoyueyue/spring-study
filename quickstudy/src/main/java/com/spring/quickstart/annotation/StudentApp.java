package com.spring.quickstart.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class StudentApp {
    public static void main(String[] args) {
//        通过注解常见上下文对象
        ApplicationContext context =new AnnotationConfigApplicationContext(StudentApp.class);
//        读取bean
        Student student = context.getBean(Student.class);
//        运行
        System.out.println(student);
    }
}
