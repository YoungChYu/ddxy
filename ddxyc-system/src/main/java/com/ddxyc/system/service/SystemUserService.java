package com.ddxyc.system.service;

import com.ddxyc.system.pojo.SystemUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@FeignClient(value = "ddxy-system", path="/system")
public interface SystemUserService {
    @PostMapping("/login")
    @ResponseBody
    String verifyByUser(@RequestParam String name,@RequestParam String pwd);
}
