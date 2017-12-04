package cn.shao.infopublish.dao;

import cn.shao.infopublish.bean.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void deleteUserById(User user);
    public User getUserByUsername(String username);
    public User getUserById(String id);
    public List getAllUser();
}
