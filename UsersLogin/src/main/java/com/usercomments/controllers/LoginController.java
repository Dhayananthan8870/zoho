package com.usercomments.controllers;


import com.usercomments.entity.Comments;
import com.usercomments.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.usercomments.entity.Users;
import com.usercomments.dao.LoginDao;


@Controller
public class LoginController {
    @Autowired
     LoginDao dao;

    @RequestMapping("/signup")
    public String showform(Model m) {
        m.addAttribute("command", new Users());
        return "signup";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("users") Users users) {
        dao.save(users);
        return "login";
    }


    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String userLogin(@RequestParam("email") String email, @RequestParam("passwords") String passwords) {
        Login user = new Login();
        user.setEmail(email);
        user.setPasswords(passwords);
        String name = LoginDao.loginUser(user);
        System.out.println(name);
        if (name != null) {
            return "login";

        }
return "comment";
    }

    @RequestMapping(value = "/Comment", method = RequestMethod.POST)
    public String saveComments(@ModelAttribute("comments") Comments comments,Login login) {
        System.out.print("enterd");
        dao.save(comments,login);
        System.out.print("eee");
        return "login";
    }
}

