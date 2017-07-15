package com.pweb.service;

import com.pweb.entity.UserBaseInfo;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserBaseInfoService {

    JSONObject insertUserBaseInfo(UserBaseInfo userBaseInfo);

    JSONObject updateUserBaseInfo(UserBaseInfo userBaseInfo);

    JSONObject deleteUserBaseInfo(String username);

    JSONObject queryUserBaseInfo(String username);

    JSONObject queryUserBaseInfo(String name, Integer first, Integer sum);
}
