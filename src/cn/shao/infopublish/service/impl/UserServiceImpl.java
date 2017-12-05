package cn.shao.infopublish.service.impl;

import cn.shao.infopublish.bean.User;
import cn.shao.infopublish.dao.UserDao;
import cn.shao.infopublish.service.UserService;

import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/5.
 */
public class UserServiceImpl  implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }


    public void addUser(User user) {
    this.userDao.addUser(user);

    }


    public void deleteUserById(User user) {
    this.userDao.deleteUserById(user);
    }


    public User getUserByUsername(String username) {
        return this.userDao.getUserByUsername(username);
    }


    public User getUserById(String id) {
        return this.userDao.getUserById(id);
    }


    public List getAllUser() {
        return this.userDao.getAllUser();
    }
}
