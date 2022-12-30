package com.flyme.web.login.controller;


import com.flyme.basecommon.controller.BaseController;
import com.flyme.web.login.bean.UserBean;
import com.flyme.web.login.service.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/18 16:43
 * @description：
 * @modified By：
 * @version: $
 */

@RestController(UserController.BEAN_NAME)
@RequestMapping("/user")
@Slf4j
public class UserController extends BaseController {
    static final String BEAN_NAME = "com.flyme.web.login.controller.UserController";
    Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/dirUser")
    public List<UserBean> dirUser() {
        logger.info("开始执行");
        return userService.dirUser();
    }

    @RequestMapping("/queryUser")
    public List<UserBean> queryUser(@RequestParam("user") UserBean user,
                                @RequestParam("pageSize") int pageSize,
                                @RequestParam("page") int page) {
//        return userService.queryUserByIf(user);
        return null;
    }
    @GetMapping("/a")
    public String diUser() {
        return "hello";
    }
    @GetMapping("/b")
    public List<UserBean> b() {
        return userService.login1();
    }
}


