package com.lei.service.Impl;

import com.lei.entity.AuthorityEntity;
import com.lei.mapper.AuthorityMapper;
import com.lei.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public List<AuthorityEntity> queryAuthAllByUid(Long uId) {
        return authorityMapper.selectAllAuthByUid(uId);
    }

    @Override
    public List<AuthorityEntity> queryAuthAllByRoleCode(String roleCode) {
        return authorityMapper.selectAllAuthByRoleCode(roleCode);
    }
}
