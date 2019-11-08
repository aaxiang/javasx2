package com.lei.service;

import com.lei.entity.AuthorityEntity;

import java.util.List;

public interface AuthorityService {
    /**
     * 根据用户id查询他的所有权限
     * @param uId
     * @return
     */
    List<AuthorityEntity> queryAuthAllByUid(Long uId);

    /**
     * 根据roleCode查询该角色所有的权限
     * @param roleCode
     * @return
     */
    List<AuthorityEntity> queryAuthAllByRoleCode(String roleCode);
}
