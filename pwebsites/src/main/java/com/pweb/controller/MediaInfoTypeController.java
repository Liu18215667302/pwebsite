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


/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Controller
public class MediaInfoTypeController {

    @Autowired
    private MediaInfoTypeService mediaInfoTypeService;

    @RequestMapping(value = "/insertMediaInfoType", method = RequestMethod.GET)
    public String insertMediaInfoType(Model model) throws Exception {
        MediaInfoType mediaInfoType = new MediaInfoType();
        mediaInfoType.setTitle("asdfs你");
        mediaInfoType.setRemark("sdfsdfsdf");
        JSONObject jsonObject = mediaInfoTypeService.insertMediaInfoType(mediaInfoType);
        model.addAttribute("showList",jsonObject);
        return "showInfo";
    }

    @RequestMapping(value = "/queryMediaInfoTypeAll", method = RequestMethod.GET)
    public String queryMediaInfoType(Model model) throws Exception{
        JSONObject jsonObject = mediaInfoTypeService.queryMediaInfoType();
        model.addAttribute("showList", jsonObject);
        return "showInfo";
    }

    @RequestMapping(value = "/queryMediaInfoTypeById", method = RequestMethod.GET)
    public String queryMediaInfoTypeById(Model model) throws Exception {
        JSONObject jsonObject = mediaInfoTypeService.queryMediaInfoTypeById("0021312");
        model.addAttribute("showList", jsonObject);
        return "showInfo";
    }
}
