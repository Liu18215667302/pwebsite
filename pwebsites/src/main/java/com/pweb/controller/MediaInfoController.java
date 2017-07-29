package com.pweb.controller;

import com.pweb.service.MediaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
