package com.pweb.service;

import com.pweb.entity.UserProject;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserProjectService {

    JSONObject insertUserProject(UserProject userProject);

    JSONObject updateUserProject(UserProject userProject);

    JSONObject deleteUserProject(String id);

    JSONObject queryUserProject(String id);

    JSONObject queryUserProject(String name, Integer first, Integer sum);

    JSONObject queryUserProjectByUsername(String username);
}
