package com.pweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
@Controller
public class MainController {

    /**
     * 跳转到main页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/enterMain",method = RequestMethod.GET)
    public String enterMain() throws Exception {
        return "main";
    }

    /**
     * 跳转到左边内容页
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/enterLeftContent",method = RequestMethod.GET)
    public String enterLeftContent() throws Exception {
        return "left-content/left";
    }

    /**
     * 跳转到右边内容页
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/enterRightContent", method = RequestMethod.GET)
    public String enterRightContent() throws Exception {
        return "right-content/right";
    }

    /**
     * 跳转至内容页
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getContent", method = RequestMethod.GET)
    public String enterContent() throws Exception {
        return "left-content/content";
    }
}
