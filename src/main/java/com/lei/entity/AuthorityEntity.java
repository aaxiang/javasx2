package com.lei.entity;

import java.util.List;

public class AuthorityEntity {
    private Long id;

    private String authorityCode;

    private String authorityName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode == null ? null : authorityCode.trim();
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    @Override
    public String toString() {
        return "AuthorityEntity{" +
                "id=" + id +
                ", authorityCode='" + authorityCode + '\'' +
                ", authorityName='" + authorityName + '\'' +
                '}';
    }
}