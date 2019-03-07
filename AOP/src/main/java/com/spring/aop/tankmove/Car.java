package com.spring.aop.tankmove;

public class Car implements Move {
    @Override
    public void move() {
        System.out.println("Car is moving ......");
    }
}
