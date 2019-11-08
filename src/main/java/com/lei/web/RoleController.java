package com.lei.web;


import com.lei.entity.AuthorityEntity;
import com.lei.entity.RoleEntity;
import com.lei.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("/role/queryRoleOnAuth")
    public String queryRoleOnAuth(Model model, @RequestParam(required = true,value = "role")String roleCode){
        // 根据roleCode查询该角色所有的权限
        List<AuthorityEntity> authorityEntityList = authorityService.queryAuthAllByRoleCode(roleCode);
        RoleEntity role = new RoleEntity();
        role.setRoleCode(roleCode);
        model.addAttribute("role",role);
        // 覆盖原来的角色权限
        model.addAttribute("authorityEntityList",authorityEntityList);
        return "/system/roleIndex";
    }

}
