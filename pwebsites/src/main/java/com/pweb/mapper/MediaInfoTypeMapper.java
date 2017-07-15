package com.pweb.mapper;

import com.pweb.entity.MediaInfoType;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface MediaInfoTypeMapper {

    public Integer insertMediaInfoType(MediaInfoType mediaInfoType) throws Exception;

    public Integer insertMediaInfoTypeBatch(Map<String,List<MediaInfoType>> map) throws Exception;

    public Integer updateMediaInfoType(MediaInfoType mediaInfoType) throws Exception;

    public Integer deleteMediaInfoType(@Param("id") String id) throws Exception;

    public MediaInfoType queryMediaInfoTypeById(@Param("id") String id) throws Exception;

    public List<MediaInfoType> queryMediaInfoTypeAll() throws Exception;
}
