package com.pweb.service.impl;

import com.pweb.entity.MediaInfo;
import com.pweb.service.MediaInfoService;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/23 0023.
 */
public class MediaInfoServiceImplTest {

    private MediaInfoService mediaInfoService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-web.xml"
                ,"classpath:spring-mybatis.xml"});

        mediaInfoService = (MediaInfoService)context.getBean(MediaInfoServiceImpl.class);
    }

    @Test
    public void insertMediaInfo() throws Exception {
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.setUsername("admin");
        mediaInfo.setTypeId("45b468f7-38ae-481a-aa04-07d45f7d5e04");
        mediaInfo.setTitle("html5基础知识15");
        mediaInfo.setContent("我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。\n" +
                "对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。\n" +
                "当显示页面时，浏览器会移除源代码中多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。");
        JSONObject jsonObject = mediaInfoService.insertMediaInfo(mediaInfo);
        System.out.println(jsonObject.toString());
    }

    @Test
    public void updateMediaInfo() throws Exception {
    }

    @Test
    public void deleteMediaInfo() throws Exception {
    }

    @Test
    public void queryMediaInfo() throws Exception {
    }

    @Test
    public void queryMediaInfo1() throws Exception {
    }

}