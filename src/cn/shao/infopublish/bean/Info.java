package cn.shao.infopublish.bean;

import java.util.Date;

public class Info implements java.io.Serializable {
    private String id;
    private User user;
    private String title;

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public String getContent() {
        return content;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public String getAccessoryURL() {
        return accessoryURL;
    }

    private Date pubDate;

    private String content;
    private String accessoryName;
    private String accessoryURL;

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public void setAccessoryURL(String accessoryURL) {
        this.accessoryURL = accessoryURL;
    }
}
