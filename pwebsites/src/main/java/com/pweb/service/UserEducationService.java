package com.pweb.service;

import com.pweb.entity.UserEducation;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserEducationService {

    JSONObject insertUserEducation(UserEducation userEducation);

    JSONObject updateUserEducation(UserEducation userEducation);

    JSONObject deleteUserEducation(String id);

    JSONObject queryUserEducation(String id);

    JSONObject queryUserEducation(String graducatedSchool, Integer first, Integer sum);

    JSONObject queryUserEducationByUsername(String username);
}
