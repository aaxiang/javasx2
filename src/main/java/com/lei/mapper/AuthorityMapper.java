package com.lei.mapper;

import com.lei.entity.AuthorityEntity;
import java.util.List;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthorityEntity record);

    AuthorityEntity selectByPrimaryKey(Long id);

    List<AuthorityEntity> selectAll();

    int updateByPrimaryKey(AuthorityEntity record);

    /**
     * 根据uId查询该用户所有的权限
     * @param uId
     * @return
     */
    List<AuthorityEntity> selectAllAuthByUid(Long uId);

    /**
     * 根据roleCode查询所有的权限
     * @param roleCode
     * @return
     */
    List<AuthorityEntity> selectAllAuthByRoleCode(String roleCode);
}