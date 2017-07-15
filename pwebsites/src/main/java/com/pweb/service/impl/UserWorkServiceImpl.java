package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserWork;
import com.pweb.service.UserWorkService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserWorkService")
public class UserWorkServiceImpl implements UserWorkService {

    private UserWork userWork;

    @Autowired
    public void setUserWork(UserWork userWork) {
        this.userWork = userWork;
    }

    public JSONObject insertUserWork(UserWork userWork) {
        Integer result = null;
        try {

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
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject queryUserWork(String name, Integer first, Integer sum) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
