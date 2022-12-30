package com.flyme.web.login.bean;

import com.flyme.basecommon.bean.BaseBean;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class UserBean extends BaseBean {
    @Id
    @Column(name = "UUID")
    private String uuid;    //uuid
    @Column(name = "REAL_NAME")
    private String realName;//姓名
    @Column(name = "LOGIN_NAME")
    private String loginName;//登录名
    @Column(name = "PWD")
    private String pwd;//密码
    @Column(name = "SEX")
    private String sex;    //性别
    @Column(name = "MOBILE")
    private String mobile;    //手机号
    @Column(name = "MAIL")
    private String email;    //邮件
    @Column(name = "USER_TYPE")
    private String userType;//用户类型
    @Column(name = "DELETE_FLAG")
    private String delFlag;//删除标记
    @Column(name = "OPEN_FLAG")
    private String openFlag;//开启状态
    @Column(name = "CREATE_TIME")
    private Date createDate;//创建时间
    @Column(name = "UPDATE_TIME")
    private Date updateDate;//修改时间
    @Column(name = "REMARK")
    private String remark;//备注
    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;//上次登录时间
    @Column(name = "TOTAL_LOGIN_COUNT")
    private String totalLoginCount;//总登录次数
    @Column(name = "FAILED_LOGIN_COUNT")
    private String failedLoginCount;//失败登录次数
    @Column(name = "ORGID")
    private String orgId;    //组织Id
    @Column(name = "EDIT_PWD_TIME")
    private Date editPwdTime;//修改密码时间
    @Column(name = "ACTIVE_STATUS")
    private String activeStatus;//激活状态
    @Column(name = "ACTIVE_DEAD_LINE")
    private Date activeDeadLine;//激活时间
    @Column(name = "PROVINCE_ID")
    private String provinceId;    //省份Id
    @Column(name = "CITY_ID")
    private String cityId;        //城市Id
    @Column(name = "PC_STATUS")
    private String pcStatus;    //PC端制证状态
    @Column(name = "APP_STATUS")
    private String appStatus;    //移动端制证状态
    @Column(name = "PWD_EXPRITY_TIME")
    private String pwdFailureTime;//密码失效时间
}
