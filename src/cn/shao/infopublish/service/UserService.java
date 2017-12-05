package cn.shao.infopublish.service;

import cn.shao.infopublish.bean.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void deleteUserById(String id);
    public User getUserByUsername(String username);
    public User getUserById(String id);
    public List getAllUser();
}
