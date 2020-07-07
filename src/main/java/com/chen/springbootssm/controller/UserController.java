package com.chen.springbootssm.controller;

import com.chen.springbootssm.pojo.User;
import com.chen.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author chenjing
 * @create 2020-07-06 23:00
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/login.do")
    public String login(User user,HttpSession session){
        if(userService.login(user,session)){
            return "redirect:home.do";
        }
        return "redirect:login.html";
    }
    @RequestMapping("/logout.do")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
