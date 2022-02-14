package com.usercomments.entity;

public class Comments {
    private int id;
    private String emailid;
    private String comments;

    public Comments(int id, String emailid, String comments) {
        this.id = id;
        this.emailid = emailid;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
