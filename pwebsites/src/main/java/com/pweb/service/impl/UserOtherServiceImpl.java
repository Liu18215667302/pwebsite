package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserOther;
import com.pweb.mapper.UserOtherMapper;
import com.pweb.service.UserOtherService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserOtherService")
public class UserOtherServiceImpl implements UserOtherService {

    private UserOtherMapper userOtherMapper;

    @Autowired
    public void setUserOtherMapper(UserOtherMapper userOtherMapper) {
        this.userOtherMapper = userOtherMapper;
    }

    public JSONObject insertUserOther(UserOther userOther) {
        Integer result = null;
        try {
            result = userOtherMapper.insertUserOther(userOther);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "添加成功！");
        } else {
            return CommonUtils.setResult(true, "添加失败！");
        }
    }

    public JSONObject updateUserOther(UserOther userOther) {
        Integer result = null;
        try {
            result = userOtherMapper.updateUserOther(userOther);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "修改成功！");
        } else {
            return CommonUtils.setResult(true, "修改失败！");
        }
    }

    public JSONObject deleteUserOther(String id) {
        Integer result = null;
        try {
            result = userOtherMapper.deleteUserOther(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "删除成功！");
        } else {
            return CommonUtils.setResult(true, "删除失败！");
        }
    }

    public JSONObject queryUserOther(String id) {
        UserOther userOther = null;
        try {
            userOther = userOtherMapper.queryUserOtherById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userOther != null) {
            return CommonUtils.setResult(true, userOther);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserOther(String name, Integer first, Integer sum) {
        List<UserOther> list = null;
        Integer count = null;
        try {
            list = userOtherMapper.queryUserOtherLimit(name, first, sum);
            count = userOtherMapper.queryUserOtherLimitCount(name);
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
