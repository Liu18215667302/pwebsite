package com.pweb.service.impl;

import com.pweb.entity.MediaInfoType;
import com.pweb.service.MediaInfoTypeService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class MediaInfoTypeServiceImplTest {

    private MediaInfoTypeService mediaInfoTypeService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});
        mediaInfoTypeService = (MediaInfoTypeService)context.getBean(MediaInfoTypeServiceImpl.class);
    }

    @Test
    public void insertMediaInfoType() throws Exception {
        MediaInfoType mediaInfoType = new MediaInfoType();
        mediaInfoType.setUsername("admin");
        mediaInfoType.setTitle("科技趣闻");
        mediaInfoType.setRemark("");
        JSONObject jsonObject = mediaInfoTypeService.insertMediaInfoType(mediaInfoType);
        System.out.println(jsonObject.toString());
    }

    @Test
    public void insertMediaInfoTypeBatch() throws Exception {
    }

    @Test
    public void updateMediaInfoType() throws Exception {
    }

    @Test
    public void deleteMediaInfoType() throws Exception {
    }

    @Test
    public void queryMediaInfoTypeById() throws Exception {
    }

    @Test
    public void queryMediaInfoType() throws Exception {
    }

}