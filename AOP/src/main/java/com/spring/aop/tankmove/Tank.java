package com.spring.aop.tankmove;

public class Tank implements Move{
    @Override
    public void move() {
        System.out.println("tank is moving .......");
    }
}
