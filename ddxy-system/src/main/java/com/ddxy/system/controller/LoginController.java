package com.ddxy.system.controller;

import com.ddxy.system.pojo.SystemUser;
import com.ddxy.system.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/system")
public class LoginController {
    @Autowired
    RedisTemplate<Object,Object> redis;
    @Autowired
    SystemUserService sus;
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String name,@RequestParam String pwd){
        SystemUser user=sus.verifyByUser(name, DigestUtils.md5DigestAsHex((pwd+"limi2000").getBytes()));
        if(user!=null){
            String uuid= UUID.randomUUID().toString();
            Cookie c=new Cookie("dapl_user",uuid);
            c.setPath("/");
            c.setMaxAge(1800);
//            resp.addCookie(c);
            redis.boundValueOps(uuid).set(user.getUser_id(),40, TimeUnit.MINUTES);
            return "root";
        }
        return "";
    }
}
