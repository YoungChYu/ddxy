package com.ddxy.system.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class SystemUser {
    private int user_id;
    private String name;
    @Pattern(regexp = "[0-9]{11}",message = "手机号格式不正确！")
    private String phone;
    private int permission;
    private Date create_date;
    private Date update_date;
    private int sex;
    private String pwd;
    private int integral;
    private int countersignature;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private double amount;
}
