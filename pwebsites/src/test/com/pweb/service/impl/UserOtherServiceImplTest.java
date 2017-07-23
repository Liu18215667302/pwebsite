package com.pweb.service.impl;

import com.pweb.entity.UserOther;
import com.pweb.service.UserOtherService;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class UserOtherServiceImplTest {

    private UserOtherService userOtherService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        userOtherService = (UserOtherService)context.getBean(UserOtherServiceImpl.class);
    }

    @Test
    public void insertUserOther() throws Exception {
        UserOther userOther = new UserOther();
        userOther.setUsername("admin");
        userOther.setName("个人评价");
        userOther.setContent("我是一个乐于助人、性格内向、能吃苦不怕苦、学习能力强的人。在日常生活中善于总结问题，善于发现问题，善于钻研。我能够在很短的时间内融入一个团队，并与团队共进退。");
        JSONObject jsonObject = userOtherService.insertUserOther(userOther);
        System.out.println(jsonObject);

    }

    @Test
    public void updateUserOther() throws Exception {
    }

    @Test
    public void deleteUserOther() throws Exception {
    }

    @Test
    public void queryUserOther() throws Exception {
    }

    @Test
    public void queryUserOther1() throws Exception {
    }

}