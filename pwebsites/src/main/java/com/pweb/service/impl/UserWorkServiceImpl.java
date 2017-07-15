package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserWork;
import com.pweb.mapper.UserWorkMapper;
import com.pweb.service.UserWorkService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserWorkService")
public class UserWorkServiceImpl implements UserWorkService {

    private UserWorkMapper userWorkMapper;

    @Autowired
    public UserWorkMapper getUserWorkMapper() {
        return userWorkMapper;
    }

    public void setUserWorkMapper(UserWorkMapper userWorkMapper) {
        this.userWorkMapper = userWorkMapper;
    }

    public JSONObject insertUserWork(UserWork userWork) {
        Integer result = null;
        try {
            result = userWorkMapper.insertUserWork(userWork);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "添加成功！");
        } else {
            return CommonUtils.setResult(true, "添加失败！");
        }
    }

    public JSONObject updateUserWork(UserWork userWork) {
        Integer result = null;
        try {
            result = userWorkMapper.updateUserWork(userWork);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "修改成功！");
        } else {
            return CommonUtils.setResult(true, "修改失败！");
        }
    }

    public JSONObject deleteUserWork(String id) {
        Integer result = null;
        try {
            result = userWorkMapper.deleteUserWork(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "删除成功！");
        } else {
            return CommonUtils.setResult(true, "删除失败！");
        }
    }

    public JSONObject queryUserWork(String id) {
        UserWork userWork = null;
        try {
            userWork = userWorkMapper.queryUserWorkById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userWork != null) {
            return CommonUtils.setResult(true, userWork);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserWork(String name, Integer first, Integer sum) {
        List<UserWork> list = null;
        Integer count = null;
        try {
            list = userWorkMapper.queryUserWorkLimit(name, first, sum);
            count = userWorkMapper.queryUserWorkLimitCount(name);
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
