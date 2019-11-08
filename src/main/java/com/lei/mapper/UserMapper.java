package com.lei.mapper;

import com.lei.entity.AuthorityEntity;
import com.lei.entity.UserEntity;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    List<UserEntity> selectAll();

    int updateByPrimaryKey(UserEntity record);

    /**
     * 根据用户登录的用户名以及密码验证是否登录成功
     * @param user
     * @return
     */
    UserEntity login(UserEntity user);

    /**
     * 根据登录用户的id查询用户的角色对应的所有的权限
     * @param uId
     * @return
     */
    List<AuthorityEntity> selectAllAuthorityByUId(Long uId);
}