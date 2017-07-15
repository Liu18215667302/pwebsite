package com.pweb.service;

import com.pweb.entity.MediaInfo;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface MediaInfoService {

    JSONObject insertMediaInfo(MediaInfo mediaInfo);

    JSONObject updateMediaInfo(MediaInfo mediaInfo);

    JSONObject deleteMediaInfo(String id);

    JSONObject queryMediaInfo(String id);

    JSONObject queryMediaInfo(String title,Integer first, Integer sum);
}
