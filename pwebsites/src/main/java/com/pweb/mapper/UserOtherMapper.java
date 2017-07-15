package com.pweb.mapper;

import com.pweb.entity.UserOther;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserOtherMapper {

    public Integer insertUserOther(UserOther userOther) throws Exception;

    public Integer updateUserOther(UserOther userOther) throws Exception;

    public Integer deleteUserOther(@Param("id") String id) throws Exception;

    public UserOther queryUserOtherById(@Param("id") String id) throws Exception;

    public List<UserOther> queryUserOtherLimit(@Param("name") String name,
                                               @Param("first") Integer first,
                                               @Param("sum") Integer sum) throws Exception;
    public Integer queryUserOtherLimitCount(@Param("name") String name) throws Exception;
}
