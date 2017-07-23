package com.pweb.service.impl;

import com.pweb.entity.UserProject;
import com.pweb.service.UserProjectService;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-web.xml",
        "classpath:spring-mybatis.xml", "classpath:mybatis-config.xml" })*/
public class UserProjectServiceImplTest {

    private UserProjectService userProjectService;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        userProjectService = (UserProjectService)context.getBean(UserProjectServiceImpl.class);
    }

    @Test
    public void insertUserProject() throws Exception {
        UserProject userProject = new UserProject();
        userProject.setUsername("admin");
        userProject.setName("重庆市网络经营者交易信用标准研究");
        userProject.setType("重庆市工商局横向项目");
        userProject.setDate("2013.12—2015.12");
        userProject.setProjectInfo("重庆市网络经营者交易信用标准研究");
        userProject.setMyWork(" 1）利用MATLAB对交易信用指标进行计算");
        userProject.setMyDuty("数据分析工程师");
        JSONObject jsonObject = userProjectService.insertUserProject(userProject);
        System.out.println(jsonObject);
    }

    @Test
    public void updateUserProject() throws Exception {
    }

    @Test
    public void deleteUserProject() throws Exception {
    }

    @Test
    public void queryUserProject() throws Exception {
    }

    @Test
    public void queryUserProject1() throws Exception {
    }

}