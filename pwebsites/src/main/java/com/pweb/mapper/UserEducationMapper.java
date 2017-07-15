package com.pweb.mapper;

import com.pweb.entity.UserEducation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface UserEducationMapper {

    public Integer insertUserEducation(UserEducation userEducation) throws Exception;

    public Integer updateUserEducation(UserEducation userEducation) throws Exception;

    public Integer deleteUserEducation(@Param("id") String id) throws Exception;

    public UserEducation queryUserEducationById(@Param("id") String id) throws Exception;

    public List<UserEducation> queryUserEducationLimit(@Param("graducatedSchool") String graducatedSchool,
                                                       @Param("first") Integer first,
                                                       @Param("sum") Integer sum) throws Exception;
    public Integer queryUserEducationLimitCount(@Param("graducatedSchool") String graducatedSchool) throws Exception;
}
