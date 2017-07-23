package com.pweb.service;

import com.pweb.entity.MediaInfoType;
import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface MediaInfoTypeService {

    JSONObject insertMediaInfoType(MediaInfoType mediaInfoType);

    JSONObject insertMediaInfoTypeBatch(List<MediaInfoType> mediaInfoTypes);

    JSONObject updateMediaInfoType(MediaInfoType mediaInfoType);

    JSONObject deleteMediaInfoType(String id);

    JSONObject queryMediaInfoTypeById(String id);

    JSONObject queryMediaInfoType(String username);
}
