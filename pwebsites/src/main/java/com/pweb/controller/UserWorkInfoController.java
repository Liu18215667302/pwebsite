package com.pweb.controller;

import com.pweb.service.UserWorkService;
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
public class UserWorkInfoController {

    private UserWorkService userWorkService;

    @Autowired
    public void setUserWorkService(UserWorkService userWorkService) {
        this.userWorkService = userWorkService;
    }

    @RequestMapping(value = "/getWorkInfo", method = RequestMethod.GET)
    public void getProjectInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = userWorkService.queryUserWorkByUsername(username);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
