package cn.shao.infopublish.dao.impl;

import cn.shao.infopublish.bean.User;
import cn.shao.infopublish.dao.UserDao;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    public void addUser(User user) {
        this.getHibernateTemplate().save(user);
    }

    public void deleteUserById(User user) {
        this.getHibernateTemplate().delete(user);
    }


    public User getUserByUsername(String username) {
        List userlist=this.getHibernateTemplate().find("from User user where user.username=?",username);
        if(userlist.size()>0){
            User user= (User) userlist.get(0);
            return user;
    }


    public User getUserById(String id) {
        List userlist=this.getHibernateTemplate().find("from User user where user.id=?",id);
        if(userlist.size()>0){
            User user= (User) userlist.get(0);
            return user;
        }
    }



    public List getAllUser() {
        return this.getHibernateTemplate().loadAll(User.class);
    }
}
