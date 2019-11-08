package com.lei.mapper;

import com.lei.entity.RoleEntity;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleEntity record);

    RoleEntity selectByPrimaryKey(Long id);

    List<RoleEntity> selectAll();

    int updateByPrimaryKey(RoleEntity record);
}