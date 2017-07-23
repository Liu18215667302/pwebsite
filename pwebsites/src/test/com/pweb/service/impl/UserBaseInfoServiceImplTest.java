package com.pweb.service.impl;

import com.pweb.service.UserBaseInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class UserBaseInfoServiceImplTest {

    private UserBaseInfoService userBaseInfoService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        userBaseInfoService = (UserBaseInfoService)context.getBean(UserBaseInfoServiceImpl.class);
    }

    @Test
    public void insertUserBaseInfo() throws Exception {
    }

    @Test
    public void updateUserBaseInfo() throws Exception {
    }

    @Test
    public void deleteUserBaseInfo() throws Exception {
    }

    @Test
    public void queryUserBaseInfo() throws Exception {
    }

    @Test
    public void queryUserBaseInfo1() throws Exception {
    }

}