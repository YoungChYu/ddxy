package com.ddxy.system.service.impl;

import com.ddxy.system.dao.SystemUserDao;
import com.ddxy.system.pojo.SystemUser;
import com.ddxy.system.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    SystemUserDao dao;
    @Override
    public SystemUser verifyByUser(String name, String pwd) {
        return dao.verifyByUser(name,pwd);
    }
}
