package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserProject;
import com.pweb.mapper.UserProjectMapper;
import com.pweb.service.UserProjectService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserProjectService")
public class UserProjectServiceImpl implements UserProjectService {

    private UserProjectMapper userProjectMapper;

    @Autowired
    public void setUserProjectMapper(UserProjectMapper userProjectMapper) {
        this.userProjectMapper = userProjectMapper;
    }

    public JSONObject insertUserProject(UserProject userProject) {
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

    public JSONObject updateUserProject(UserProject userProject) {
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

    public JSONObject deleteUserProject(String id) {
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

    public JSONObject queryUserProject(String id) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject queryUserProject(String name, Integer first, Integer sum) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
