package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserBaseInfo;
import com.pweb.entity.UserWork;
import com.pweb.mapper.UserBaseInfoMapper;
import com.pweb.service.UserBaseInfoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserBaseInfoService")
public class UserBaseInfoServiceImpl implements UserBaseInfoService {

    private UserBaseInfoMapper userBaseInfoMapper;

    @Autowired
    public void setUserBaseInfoMapper(UserBaseInfoMapper userBaseInfoMapper) {
        this.userBaseInfoMapper = userBaseInfoMapper;
    }

    public JSONObject insertUserBaseInfo(UserBaseInfo userBaseInfo) {
        Integer result = null;
        try {
            result = userBaseInfoMapper.insertUserBaseInfo(userBaseInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "添加成功！");
        } else {
            return CommonUtils.setResult(true, "添加失败！");
        }
    }

    public JSONObject updateUserBaseInfo(UserBaseInfo userBaseInfo) {
        Integer result = null;
        try {
            result = userBaseInfoMapper.updateUserBaseInfo(userBaseInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "修改成功！");
        } else {
            return CommonUtils.setResult(true, "修改失败！");
        }
    }

    public JSONObject deleteUserBaseInfo(String username) {
        Integer result = null;
        try {
            result = userBaseInfoMapper.deleteUserBaseInfo(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "删除成功！");
        } else {
            return CommonUtils.setResult(true, "删除失败！");
        }
    }

    public JSONObject queryUserBaseInfo(String username) {
        UserBaseInfo userBaseInfo = null;
        try {
            userBaseInfo = userBaseInfoMapper.queryUserBaseInfoById(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userBaseInfo != null) {
            return CommonUtils.setResult(true, userBaseInfo);
        } else {
            return CommonUtils.setResult(false, "查询失败!");
        }
    }

    public JSONObject queryUserBaseInfo(String name, Integer first, Integer sum) {
        List<UserBaseInfo> list = null;
        Integer count = null;
        try {
            list = userBaseInfoMapper.queryUserBaseInfoLimit(name, first, sum);
            count = userBaseInfoMapper.queryUserBaseInfoLimitCount(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list != null && count != null) {
            return CommonUtils.setResultList(true, list, count);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject login(String username, String password) {
        UserBaseInfo userBaseInfo = null;
        try {
            userBaseInfo = userBaseInfoMapper.queryUserBaseInfoByUsernameAndPassword(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userBaseInfo != null) {
            return CommonUtils.setResult(true, userBaseInfo);
        } else {
            return CommonUtils.setResult(false, "查询失败!");
        }
    }
}
