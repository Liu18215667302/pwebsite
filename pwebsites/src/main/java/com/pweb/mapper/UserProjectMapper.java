package com.pweb.mapper;

import com.pweb.entity.UserProject;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserProjectMapper {

    public Integer insertUserProject(UserProject userProject) throws Exception;

    public Integer updateUserProject(UserProject userProject) throws Exception;

    public Integer deleteUserProject(@Param("id") String id) throws Exception;

    public UserProject queryUserProjectById(@Param("id") String id) throws Exception;

    public List<UserProject> queryUserProjectLimit(@Param("name") String name,
                                                   @Param("first") Integer first,
                                                   @Param("sum") Integer sum) throws Exception;
    public Integer queryUserProjectLimitCount(@Param("name") String name) throws Exception;
}
