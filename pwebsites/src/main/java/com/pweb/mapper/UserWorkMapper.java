package com.pweb.mapper;

import com.pweb.entity.UserWork;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserWorkMapper {

    public Integer insertUserWork(UserWork userWork) throws Exception;

    public Integer updateUserWork(UserWork userWork) throws Exception;

    public Integer deleteUserWork(@Param("id") String id) throws Exception;

    public UserWorkMapper queryUserWorkById(@Param("id") String id) throws Exception;

    public List<UserWorkMapper> queryUserWorkLimit(@Param("name") String name,
                                                   @Param("first") Integer first,
                                                   @Param("sum") Integer sum) throws Exception;
    public Integer queryUserWorkLimitCount(@Param("name") String name) throws Exception;
}
