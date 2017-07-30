package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.MediaInfo;
import com.pweb.mapper.MediaInfoMapper;
import com.pweb.service.MediaInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("MediaInfoService")
public class MediaInfoServiceImpl implements MediaInfoService {

    private MediaInfoMapper mediaInfoMapper;

    @Autowired
    public void setMediaInfoMapper(MediaInfoMapper mediaInfoMapper) {
        this.mediaInfoMapper = mediaInfoMapper;
    }

    public JSONObject insertMediaInfo(MediaInfo mediaInfo) {
        Integer result = null;
        try {
            result = mediaInfoMapper.insertMediaInfo(mediaInfo);
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "添加成功！");
        } else {
            return CommonUtils.setResult(true, "添加失败！");
        }
    }

    public JSONObject updateMediaInfo(MediaInfo mediaInfo) {
        Integer result = null;
        try {
            result = mediaInfoMapper.updateMediaInfo(mediaInfo);
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "修改成功！");
        } else {
            return CommonUtils.setResult(true, "修改失败！");
        }
    }

    public JSONObject deleteMediaInfo(String id) {
        Integer result = null;
        try {
            result = mediaInfoMapper.deleteMediaInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "删除成功！");
        } else {
            return CommonUtils.setResult(true, "删除失败！");
        }
    }

    public JSONObject queryMediaInfo(String id) {
        MediaInfo mediaInfo = null;
        try {
            mediaInfo = mediaInfoMapper.queryMediaInfoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mediaInfo != null) {
            return CommonUtils.setResult(true, mediaInfo);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryMediaInfo(String title, String typeId, String username, Integer first, Integer sum) {
        List<MediaInfo> list = null;
        Integer count = null;
        try {
            list = mediaInfoMapper.queryMediaInfoLimit(title, typeId, username, first, sum);
            count = mediaInfoMapper.queryMediaInfoLimitCount(title, typeId, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list != null && count != null) {
            return CommonUtils.setResultList(true, list, count);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }
}
