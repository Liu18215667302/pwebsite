package com.pweb.controller;

import com.pweb.service.MediaInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/29 0029.
 */
@Controller
public class MediaInfoController {

    private MediaInfoService mediaInfoService;

    @Autowired
    public void setMediaInfoService(MediaInfoService mediaInfoService) {
        this.mediaInfoService = mediaInfoService;
    }

    @RequestMapping(value = "/getMediaInfo/{id}", method = RequestMethod.GET)
    public void getMediaInfo(@PathVariable("id") String id, HttpServletResponse response,
                             HttpServletRequest request) throws Exception {
        JSONObject jsonObject = (JSONObject)request.getSession().getAttribute("user");
        String username = jsonObject.getJSONObject("result").getString("username");

        JSONObject result = mediaInfoService.queryMediaInfo("",id,username,0,10);

        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(result.toString());
    }
}
