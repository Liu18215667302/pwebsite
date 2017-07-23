package com.pweb.mapper;

import com.pweb.entity.UserBaseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserBaseInfoMapper {

    public Integer insertUserBaseInfo(UserBaseInfo userBaseInfo) throws Exception;

    public Integer updateUserBaseInfo(UserBaseInfo userBaseInfo) throws Exception;

    public Integer deleteUserBaseInfo(@Param("username") String username) throws Exception;

    public UserBaseInfo queryUserBaseInfoById(@Param("username") String username) throws Exception;

    public List<UserBaseInfo> queryUserBaseInfoLimit(@Param("name") String name,
                                                     @Param("first") Integer first,
                                                     @Param("sum") Integer sum) throws Exception;

    public Integer queryUserBaseInfoLimitCount(@Param("name") String name) throws Exception;

    public UserBaseInfo queryUserBaseInfoByUsernameAndPassword(@Param("username") String username,
                                                               @Param("password") String password) throws Exception;
}
