package com.lei.service;


import com.lei.entity.AuthorityEntity;
import com.lei.entity.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 根据传入的user对象判断用户是否能够登录成功
     * @param user
     * @return
     */
    UserEntity  login(UserEntity user);

    /**
     * 根据登陆用户的id查询他对应的所有权限
     * @param uId
     * @return
     */
    List<AuthorityEntity> queryAllAuthorityByUId(Long uId);
}
