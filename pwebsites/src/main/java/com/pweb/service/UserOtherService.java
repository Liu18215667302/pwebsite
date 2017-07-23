package com.pweb.service;

import com.pweb.entity.UserOther;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserOtherService {

    JSONObject insertUserOther(UserOther userOther);

    JSONObject updateUserOther(UserOther userOther);

    JSONObject deleteUserOther(String id);

    JSONObject queryUserOther(String id,String username);

    JSONObject queryUserOther(String name, Integer first, Integer sum);
}
