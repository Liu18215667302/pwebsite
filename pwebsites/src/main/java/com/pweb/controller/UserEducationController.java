package com.pweb.controller;

import com.pweb.entity.UserEducation;
import com.pweb.service.UserEducationService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/29 0029.
 */
@Controller
public class UserEducationController {

    private UserEducationService userEducationService;

    @Autowired
    public void setUserEducationService(UserEducationService userEducationService) {
        this.userEducationService = userEducationService;
    }

    @RequestMapping(value = "/getEductionInfo", method = RequestMethod.GET)
    public void getProjectInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = userEducationService.queryUserEducationByUsername(username);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
