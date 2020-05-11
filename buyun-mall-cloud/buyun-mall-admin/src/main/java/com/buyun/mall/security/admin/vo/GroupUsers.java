package com.buyun.mall.security.admin.vo;


import com.buyun.mall.security.admin.entity.User;

import java.util.List;

/**
 * @ClassName GroupUsers
 * @Description
 * @Author hmily
 * @Date 2020/5/11 20:41
 * @Version 1.0
 */
public class GroupUsers {
    List<User> members ;
    List<User> leaders;

    public GroupUsers() {
    }

    public GroupUsers(List<User> members, List<User> leaders) {
        this.members = members;
        this.leaders = leaders;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<User> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<User> leaders) {
        this.leaders = leaders;
    }
}
