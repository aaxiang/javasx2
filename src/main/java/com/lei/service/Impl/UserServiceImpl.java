package com.lei.service.Impl;

import com.lei.entity.AuthorityEntity;
import com.lei.entity.UserEntity;
import com.lei.mapper.UserMapper;
import com.lei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity login(UserEntity user) {
        return userMapper.login(user);
    }

    @Override
    public List<AuthorityEntity> queryAllAuthorityByUId(Long uId) {
        return userMapper.selectAllAuthorityByUId(uId);
    }
}
