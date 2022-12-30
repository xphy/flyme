package com.flyme.web.login.mapper;


import com.flyme.basecommon.mapper.BaseMapper;
import com.flyme.web.login.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository(UserMapper.BEAN_NAME)
public interface UserMapper extends BaseMapper<UserBean> {
    String BEAN_NAME = "com.flyme.login.mapper.UserMapper";

    List<UserBean> queryUserByIf(Map<String, Object> map);

    boolean insertBean(UserBean bean);

    boolean delete(int id);

    boolean update(UserBean bean);

    boolean save(UserBean bean);
    List<UserBean> login1();
}
