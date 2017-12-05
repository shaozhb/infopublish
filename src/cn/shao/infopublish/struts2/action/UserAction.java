package cn.shao.infopublish.struts2.action;

import cn.shao.infopublish.bean.User;
import cn.shao.infopublish.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by zhibin.shao on 2017/12/5.
 */
public class UserAction extends ActionSupport {
    private User user;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List getUserlist() {
        return userlist;
    }

    public void setUserlist(List userlist) {
        this.userlist = userlist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String id;
    private List userlist;
    private UserService userService;

    public String addUser() {
        this.userService.addUser(user);
        return "refresh";
    }

    public String removeUser() {
        this.userService.deleteUserById(id);
        return "refresh";
    }

    public String getAllUser() {
        userlist = userService.getAllUser();
        return "user_mgr";
    }

    public String login() {
        try {
            String username = user.getUsername();
            String password = user.getPassword();
            if (username == null || password == null || username.length() <= 0 || password.length() <= 0) {
                return "failed";
            } else {
                User user = userService.getUserByUsername(username);
                if (user != null) {
                    if (user.getPassword().equals(password)) {
                        ActionContext.getContext().getSession().put("user_id", user.getId());
                        ActionContext.getContext().getSession().put("username", user.getName());
                        return "success";
                    } else {
                        return "failed";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return  null;
    }


}
