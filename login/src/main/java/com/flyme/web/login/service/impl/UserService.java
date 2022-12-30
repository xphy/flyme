package com.flyme.web.login.service.impl;

import com.flyme.web.login.bean.UserBean;

import java.util.List;
import java.util.Map;

public interface UserService {
    String BEAN_NAME = "com.flyme.login.service.impl.UserService";

    List<UserBean> dirUser();

    List<UserBean> login1();

    List<UserBean> queryUserByIf(Map<String, Object> map);

}
