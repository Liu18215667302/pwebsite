package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserProject;
import com.pweb.mapper.UserProjectMapper;
import com.pweb.service.UserProjectService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
            result = userProjectMapper.insertUserProject(userProject);
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
            result = userProjectMapper.updateUserProject(userProject);
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
            result = userProjectMapper.deleteUserProject(id);
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
        UserProject userProject = null;
        try {
            userProject = userProjectMapper.queryUserProjectById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userProject != null) {
            return CommonUtils.setResult(true, userProject);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserProject(String name, Integer first, Integer sum) {
        List<UserProject> list = null;
        Integer count = null;
        try {
            list = userProjectMapper.queryUserProjectLimit(name, first, sum);
            count = userProjectMapper.queryUserProjectLimitCount(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list != null && count != null) {
            return CommonUtils.setResultList(true, list, count);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserProjectByUsername(String username) {
        List<UserProject> list = null;
        try {
            list = userProjectMapper.queryUserProjectByUser(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list !=null) {
            return CommonUtils.setResult(true, list);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }
}
