package com.flyme.web.login.service;


import com.flyme.web.login.bean.UserBean;
import com.flyme.web.login.mapper.UserMapper;
import com.flyme.web.login.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Slf4j
@Service(UserServiceImpl.BEAN_NAME)
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserBean> dirUser() {
        return userMapper.selectAll();
    }
    public List<UserBean> login1() {
        return userMapper.login1();
    }
    public List<UserBean> queryUserByIf(Map<String, Object> map) {
        return userMapper.queryUserByIf(map);
    }
}
