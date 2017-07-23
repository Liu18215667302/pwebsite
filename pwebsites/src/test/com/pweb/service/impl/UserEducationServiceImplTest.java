package com.pweb.service.impl;

import com.pweb.entity.UserEducation;
import com.pweb.service.UserEducationService;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class UserEducationServiceImplTest {

    private UserEducationService userEducationService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        userEducationService = (UserEducationService)context.getBean(UserEducationServiceImpl.class);
    }

    @Test
    public void insertUserEducation() throws Exception {
        UserEducation userEducation = new UserEducation();
        userEducation.setUsername("admin");
        userEducation.setEducation("研究生");
        userEducation.setGraducatedSchool("重庆邮电大学");
        userEducation.setDuty("班长");
        userEducation.setDate("2013.09—2016.06");
        JSONObject jsonObject = userEducationService.insertUserEducation(userEducation);
        System.out.println(jsonObject.toString());
    }

    @Test
    public void updateUserEducation() throws Exception {
    }

    @Test
    public void deleteUserEducation() throws Exception {
    }

    @Test
    public void queryUserEducation() throws Exception {
    }

    @Test
    public void queryUserEducation1() throws Exception {
    }

}