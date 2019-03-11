package com.spring.aop.image;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ImageApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ImageCopy imageCopy=context.getBean(ImageCopy.class);
        try {
            imageCopy.copyImage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
