package com.spring.quickstart.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args){
        //        读入配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        Student student= (Student) context.getBean("student");
        //运行helloWorld的方法
        System.out.println(student);
    }
}
