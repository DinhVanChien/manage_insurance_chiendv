package com.quanlybaohiem.controller;
import com.quanlybaohiem.service.LoginService;
import com.quanlybaohiem.validate.ValidateLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    ValidateLogin validateLogin;

    @RequestMapping("/login")
    public String viewLogin() {
        System.out.println("Vào đây à bạn 1");
        return "Login";
    }


    @PostMapping ("/loginA")
    public String login(Model model) {
        System.out.println("Vào đây à bạn 2");
        List<String> list = new ArrayList<String>();
        String username = (String) model.getAttribute("username");
        System.out.println("Đây là user name:  "+username);
        String password = (String)model.getAttribute("password");
        System.out.println("Đây là user pass:  "+password);
        if(validateLogin.validateLogin(username, password) == null) {
            return "hello";
        }
        return "Login";
    }


}
