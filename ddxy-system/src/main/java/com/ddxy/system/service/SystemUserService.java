package com.ddxy.system.service;

import com.ddxy.system.pojo.SystemUser;

public interface SystemUserService {
    public SystemUser verifyByUser(String name,String pwd);
}
