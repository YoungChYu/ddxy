package com.ddxyc.system.pojo;

import lombok.Data;

import java.util.List;

@Data
public class SystemMenu {
    private int id;
    private String menu_name;
    private String url;
    private int parent_id;
    private String icon;
    private String perms;
    private int num;
    private List<SystemMenu> ms;
}
