package com.lei.service;

import com.lei.entity.RoleEntity;

//角色Service
public interface RoleService {

    /**
     * 根据角色id查询角色
     * @param rId
     * @return
     */
    RoleEntity queryRoleByRId(Long rId);
}
