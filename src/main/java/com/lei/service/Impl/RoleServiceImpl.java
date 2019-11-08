package com.lei.service.Impl;

import com.lei.entity.RoleEntity;
import com.lei.mapper.RoleMapper;
import com.lei.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleEntity queryRoleByRId(Long rId) {
        return roleMapper.selectByPrimaryKey(rId);
    }
}
