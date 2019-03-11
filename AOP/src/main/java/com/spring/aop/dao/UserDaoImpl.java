package com.spring.aop.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao{
    private static final Logger logger= LoggerFactory.getLogger(UserDaoImpl.class);


    @Override
    public void insert() {
        logger.info("现在开始插入....");
    }
}
