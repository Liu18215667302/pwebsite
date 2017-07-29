package com.pweb.controller;

import com.pweb.service.UserProjectService;
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
public class UserProjectInfoController {


    private UserProjectService userProjectService;

    @Autowired
    public void setUserProjectService(UserProjectService userProjectService) {
        this.userProjectService = userProjectService;
    }

    @RequestMapping(value = "/getProjectInfo", method = RequestMethod.GET)
    public void getProjectInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = userProjectService.queryUserProjectByUsername(username);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
