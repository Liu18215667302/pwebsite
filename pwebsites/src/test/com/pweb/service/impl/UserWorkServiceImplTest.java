package com.pweb.service.impl;

import com.pweb.entity.UserWork;
import com.pweb.service.UserProjectService;
import com.pweb.service.UserWorkService;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class UserWorkServiceImplTest {

    private UserWorkService userWorkService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        userWorkService = (UserWorkService)context.getBean(UserWorkServiceImpl.class);
    }

    @Test
    public void insertUserWork() throws Exception {
        UserWork userWork = new UserWork();
        userWork.setUsername("admin");
        userWork.setName("重庆费切尔科技有限公司");
        userWork.setDate("2015.3—2015.8");
        userWork.setMyDuty("软件工程师(游戏服务器的开发)");
        userWork.setContent("1）根据需求完成系统的设计与编码；<br>\n" +
                "2）修改测试人员提出的问题；<br>\n" +
                "3）辅助前台完成部分手游前端的编码。");
        JSONObject jsonObject = userWorkService.insertUserWork(userWork);
        System.out.println(jsonObject.toString());
    }

    @Test
    public void updateUserWork() throws Exception {
    }

    @Test
    public void deleteUserWork() throws Exception {
    }

    @Test
    public void queryUserWork() throws Exception {
    }

    @Test
    public void queryUserWork1() throws Exception {
    }

}