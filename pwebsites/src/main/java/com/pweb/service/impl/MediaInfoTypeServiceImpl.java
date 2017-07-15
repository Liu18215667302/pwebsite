package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.MediaInfoType;
import com.pweb.mapper.MediaInfoTypeMapper;
import com.pweb.service.MediaInfoTypeService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("MediaInfoTypeService")

public class MediaInfoTypeServiceImpl implements MediaInfoTypeService {

    private MediaInfoTypeMapper mediaInfoTypeMapper;

    @Autowired
    public void setMediaInfoTypeMapper(MediaInfoTypeMapper mediaInfoTypeMapper) {
        this.mediaInfoTypeMapper = mediaInfoTypeMapper;
    }

    public JSONObject insertMediaInfoType(MediaInfoType mediaInfoType) {
        Integer result = null;
        try {
            result = mediaInfoTypeMapper.insertMediaInfoType(mediaInfoType);
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

    public JSONObject insertMediaInfoTypeBatch(List<MediaInfoType> mediaInfoTypes) {
        Integer result = null;
        try {
            Map<String,List<MediaInfoType>> map = new HashMap<String, List<MediaInfoType>>();
            map.put("MediaInfoTypes",mediaInfoTypes);
            result = mediaInfoTypeMapper.insertMediaInfoTypeBatch(map);
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }
        if (result != null && result == mediaInfoTypes.size()) {
            return CommonUtils.setResult(true, "批量添加成功！");
        } else {
            return CommonUtils.setResult(true, "批量添加失败！");
        }
    }

    public JSONObject updateMediaInfoType(MediaInfoType mediaInfoType) {
        Integer result = null;
        try {
            result = mediaInfoTypeMapper.updateMediaInfoType(mediaInfoType);
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

    public JSONObject deleteMediaInfoType(String id) {
        Integer result = null;
        try {
            result = mediaInfoTypeMapper.deleteMediaInfoType(id);
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

    public JSONObject queryMediaInfoTypeById(String id) {
        MediaInfoType mediaInfoType = null;
        try {
            mediaInfoType = mediaInfoTypeMapper.queryMediaInfoTypeById(id);
        } catch (Exception e) {
            e.printStackTrace();
            mediaInfoType = null;
        }
        if (mediaInfoType != null) {
            return CommonUtils.setResult(true, mediaInfoType);
        } else {
            return CommonUtils.setResult(true, "查询失败！");
        }
    }

    public JSONObject queryMediaInfoType() {
        List<MediaInfoType> list = null;
        try {
            list = mediaInfoTypeMapper.queryMediaInfoTypeAll();
        } catch (Exception e) {
            e.printStackTrace();
            list = null;
        }
        if (list != null && list.size() > 0) {
            return CommonUtils.setResultList(true,list,list.size());
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }
}
