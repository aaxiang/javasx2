package com.lei.entity;

import java.util.List;

public class UserEntity {
    private Long id;

    private String name;

    private String username;

    private String password;

    private Long roleId;

    /**这是用户的所有 */
    private List<AuthorityEntity> authorityList;

    public List<AuthorityEntity> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<AuthorityEntity> authorityList) {
        this.authorityList = authorityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}