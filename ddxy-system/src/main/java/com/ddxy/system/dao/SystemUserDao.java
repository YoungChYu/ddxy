package com.ddxy.system.dao;
import com.ddxy.system.pojo.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
@Mapper
public interface SystemUserDao {
    SystemUser verifyByUser(@Param("name") String name,@Param("pwd") String pwd);
}
