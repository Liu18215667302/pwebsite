package com.pweb.controller;

import com.pweb.entity.MediaInfoType;
import com.pweb.service.MediaInfoTypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Controller
public class MediaInfoTypeController {

    @Autowired
    private MediaInfoTypeService mediaInfoTypeService;

    /**
     * 获取菜单信息
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/getMediaType", method = RequestMethod.GET)
    public void getMediaType(HttpServletRequest request, HttpServletResponse response) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = mediaInfoTypeService.queryMediaInfoType(username);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
