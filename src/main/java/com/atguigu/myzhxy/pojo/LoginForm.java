package com.atguigu.myzhxy.pojo;

import lombok.Data;
/**
 * @project
 * @description:用户登录表单信息
 */
@Data
public class LoginForm {
    private String username;
    private String password;
    private String verifiCode;
    private Integer userType;

}
