package com.flyme.basecommon.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/18 15:21
 * @description：
 * @modified By：
 * @version: $
 */

public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

