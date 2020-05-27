package com.hxk.test.entity;

public class User {
    private Integer uid;
    private String name;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}