package com.lei.web;


import com.lei.entity.AuthorityEntity;
import com.lei.entity.RoleEntity;
import com.lei.entity.UserEntity;
import com.lei.service.AuthorityService;
import com.lei.service.RoleService;
import com.lei.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private AuthorityService authorityService;

    // 验证用户是否登录成功
    @RequestMapping("/user/login")
    public String login(HttpServletRequest request, Model model, UserEntity user){

//        获取登录的用户名以及密码进行判断
        UserEntity selectUser = userService.login(user);
        if(null != selectUser){
            // 用户登陆成功 将user对象放入session中
            HttpSession session = request.getSession();
            session.setAttribute("user",selectUser);
            // 查询该用户的角色类型
           RoleEntity roleEntity = roleService.queryRoleByRId(selectUser.getRoleId());
           model.addAttribute("role",roleEntity);
            // 根据用户id查询该用户的所拥有的所有权限
           List<AuthorityEntity> authorityEntityList = authorityService.queryAuthAllByUid(selectUser.getId());
           model.addAttribute("authorityEntityList",authorityEntityList);
        }else{
            // 用户登陆失败
            model.addAttribute("msg","账户或密码错误，请重试");
            return "forward:/index";
        }
        return "/system/roleIndex";
    }

}
