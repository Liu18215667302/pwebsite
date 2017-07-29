package com.pweb.service.impl;

import com.pweb.common.CommonUtils;
import com.pweb.entity.UserEducation;
import com.pweb.mapper.UserEducationMapper;
import com.pweb.service.UserEducationService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
@Service("UserEducationService")
public class UserEducationServiceImpl implements UserEducationService {

    private UserEducationMapper userEducationMapper;

    @Autowired
    public void setUserEducationMapper(UserEducationMapper userEducationMapper) {
        this.userEducationMapper = userEducationMapper;
    }

    public JSONObject insertUserEducation(UserEducation userEducation) {
        Integer result = null;
        try {
            result = userEducationMapper.insertUserEducation(userEducation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "添加成功！");
        } else {
            return CommonUtils.setResult(true, "添加失败！");
        }
    }

    public JSONObject updateUserEducation(UserEducation userEducation) {
        Integer result = null;
        try {
            result = userEducationMapper.updateUserEducation(userEducation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "修改成功！");
        } else {
            return CommonUtils.setResult(true, "修改失败！");
        }
    }

    public JSONObject deleteUserEducation(String id) {
        Integer result = null;
        try {
            result = userEducationMapper.deleteUserEducation(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result != null && result > 0) {
            return CommonUtils.setResult(true, "删除成功！");
        } else {
            return CommonUtils.setResult(true, "删除失败！");
        }
    }

    public JSONObject queryUserEducation(String id) {
        UserEducation userEducation = null;
        try {
            userEducation = userEducationMapper.queryUserEducationById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userEducation != null) {
            return CommonUtils.setResult(true, userEducation);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserEducation(String graducatedSchool, Integer first, Integer sum) {
        List<UserEducation> list = null;
        Integer count = null;
        try {
            list = userEducationMapper.queryUserEducationLimit(graducatedSchool, first,sum);
            count = userEducationMapper.queryUserEducationLimitCount(graducatedSchool);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list != null && count != null) {
            return CommonUtils.setResultList(true, list, count);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }

    public JSONObject queryUserEducationByUsername(String username) {
        List<UserEducation> list = null;
        try {
            list = userEducationMapper.queryUserEductionByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list != null) {
            return CommonUtils.setResult(true, list);
        } else {
            return CommonUtils.setResult(false, "查询失败！");
        }
    }
}
