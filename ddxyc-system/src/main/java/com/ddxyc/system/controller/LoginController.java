package com.ddxyc.system.controller;

import com.ddxyc.system.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping("/system")
public class LoginController {
    @Autowired
    SystemUserService sus;
    @PostMapping("/login")
    @ResponseBody
    public String verify(@RequestParam String name,@RequestParam String pwd){
        String s=sus.verifyByUser(name,pwd);
        return s;
    }
    @GetMapping("/")
    public String indexS(){
        return "index";
    }
}
