package com.spring.aop.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(BeforeAdvice.class);

    public void beforeMethod(){
        logger.info("连接数据库");
    }
}
