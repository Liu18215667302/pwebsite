package com.pweb.controller;

import com.pweb.entity.MediaInfoType;
import com.pweb.service.MediaInfoTypeService;
import com.pweb.service.UserBaseInfoService;
import com.pweb.service.UserOtherService;
import freemarker.template.utility.StringUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/7/22 0022.
 */
@Controller
public class MainController {

    @Autowired
    private UserBaseInfoService userBaseInfoService;

    @Autowired
    private UserOtherService userOtherService;

    /**
     * 跳转到main页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/enterMain",method = RequestMethod.GET)
    public String enterMain(String username, String password, HttpServletRequest request) throws Exception {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            username = "admin";
            password = "admin";
        }
        JSONObject jsonObject = userBaseInfoService.login(username,password);
        request.getSession().setAttribute("user",jsonObject);
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

    @RequestMapping(value = "/getFirstPageInfo", method = RequestMethod.GET)
    public void getFirstPageInfo(HttpServletResponse response, HttpServletRequest request) throws Exception{
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject skillinfo = userOtherService.queryUserOther("skillinfo", username);
        JSONObject result = userOtherService.queryUserOther("result", username);
        JSONObject myskill = userOtherService.queryUserOther("myskill", username);
        JSONObject personalPJ = userOtherService.queryUserOther("588b1d91-913f-400c-9947-84a8c27a50e9", username);

        JSONObject resultJson = new JSONObject();
        resultJson.put("skillinfo",skillinfo);
        resultJson.put("result",result);
        resultJson.put("myskill",myskill);
        resultJson.put("personalPJ",personalPJ);
        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(resultJson.toString());
    }

    /**
     * 加载简历
     * @return
     */
    @RequestMapping(value = "/mainPrompt", method = RequestMethod.GET)
    public String mainPrompt(Model model,HttpServletRequest request) {
        return "/prompt/prompt-sub";
    }

    /**
     * 获取我的技能
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="/getMySkillInfo", method = RequestMethod.GET)
    public void getMySkillInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id="5ba9cad6-016e-476c-88f9-5e02618f12ad";
        getInfo(id,request,response);
    }

    /**
     * 获取我的成果
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="/myMyAchievement", method = RequestMethod.GET)
    public void myMyAchievement(HttpServletRequest request, HttpServletResponse response) throws Exception {
       String id="20983cae-4dfd-4183-9303-dd118707ee6c";
       getInfo(id,request,response);
    }

    /**
     * 获取我的成果
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="/myPersonalPJ", method = RequestMethod.GET)
    public void myPersonalPJ(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id="588b1d91-913f-400c-9947-84a8c27a50e9";
        getInfo(id,request,response);
    }
    private void getInfo(String id,HttpServletRequest request, HttpServletResponse response) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = userOtherService.queryUserOther(id, username);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
