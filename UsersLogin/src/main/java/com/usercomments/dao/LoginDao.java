package com.usercomments.dao;

import com.usercomments.entity.Comments;
import com.usercomments.entity.Login;
import org.springframework.jdbc.core.JdbcTemplate;
import com.usercomments.entity.Users;

public class LoginDao {
    private static JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Users p) {
        String sql = "insert into users(email,passwords,secret) values('" + p.getemail() + "','" + p.getPasswords() + "','" + p.getsecret() + "')";
        return template.update(sql);
    }


    public static String loginUser(Login user) {

        String sql = "SELECT * FROM users WHERE email= '" + user.getEmail() + "' AND passwords='" + user.getPasswords() + "'";
        System.out.println(user.getEmail());
        try {
            System.out.println("ee");
            String userId = template.queryForObject(sql, new Object[]{
                    user.getEmail(), user.getPasswords()}, String.class);
            System.out.println(userId);
            return userId;

        } catch (Exception e) {
            return null;
        }
    }

    public int save(Comments comments, Login login) {
        String sql = "insert into Comments(email,comments) values('" + login.getEmail() + "','" + comments.getComments() + "')";
        return template.update(sql);
    }

}



