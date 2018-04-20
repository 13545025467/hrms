package com.lv.controller;

import com.lv.model.User;
import com.lv.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by xgq on 2018/4/20.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model) throws Exception{
        User user1 = userService.login(user);
        if (null!=user1){
            model.addAttribute("user",user1);
            return "empView";
        }
        model.addAttribute("error","用户名或密码错误");
        return "../../index";
    }

}
