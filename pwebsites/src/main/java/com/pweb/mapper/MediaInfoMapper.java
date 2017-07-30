package com.pweb.mapper;

import com.pweb.entity.MediaInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public interface MediaInfoMapper {

    public Integer insertMediaInfo(MediaInfo mediaInfo) throws Exception;

    public Integer updateMediaInfo(MediaInfo mediaInfo) throws Exception;

    public Integer deleteMediaInfo(@Param("id") String id) throws Exception;

    public MediaInfo queryMediaInfoById(@Param("id") String id) throws Exception;

    public List<MediaInfo> queryMediaInfoLimit(@Param("title") String title,
                                               @Param("typeId") String typeId,
                                               @Param("username") String username,
                                               @Param("first") Integer first,
                                               @Param("sum") Integer sum) throws Exception;

    public Integer queryMediaInfoLimitCount(@Param("title") String title,
                                            @Param("typeId") String typeId,
                                            @Param("username") String username) throws Exception;
}
