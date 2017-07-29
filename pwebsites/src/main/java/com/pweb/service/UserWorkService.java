package com.pweb.service;

import com.pweb.entity.UserWork;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserWorkService {

    JSONObject insertUserWork(UserWork userWork);

    JSONObject updateUserWork(UserWork userWork);

    JSONObject deleteUserWork(String id);

    JSONObject queryUserWork(String id);

    JSONObject queryUserWork(String name, Integer first, Integer sum);

    JSONObject queryUserWorkByUsername(String username);
}
