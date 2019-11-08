package com.lei.mapper;

import com.lei.entity.RoleAuthRelEntity;
import java.util.List;

public interface RoleAuthRelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleAuthRelEntity record);

    RoleAuthRelEntity selectByPrimaryKey(Long id);

    List<RoleAuthRelEntity> selectAll();

    int updateByPrimaryKey(RoleAuthRelEntity record);
}