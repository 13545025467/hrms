package com.lv.controller;

import com.lv.model.Manage;
import com.lv.model.User;
import com.lv.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by xgq on 2018/4/20.
 */
@Controller
public class UserController {
    @Resource
    private User user;
    @Resource
    private Manage manage;
    @Resource
    private UserService userService;

    @RequestMapping("/login")//登录
    public String login(String user_name,String user_pass,String differentUser ,HttpSession session) throws Exception{
        int flag=Integer.parseInt(differentUser);//判断用户类型
        switch (flag){
            case 1:
                user.setUser_name(user_name);
                user.setUser_pass(user_pass);
                User user1 = userService.login(user);
                if (null!=user1){
                    session.setAttribute("user",user1);
                    session.removeAttribute("error");
                    return "../../index";
                }
                session.setAttribute("error","账号或密码错误");
                return "../../index";
            case 2:

                break;
            case 3:
                manage.setMan_name(user_name);
                manage.setMan_pass(user_pass);
                Manage manage1 = userService.manageLogin(manage);
                if (null!=manage1){
                    session.setAttribute("manage",manage1);
                    session.removeAttribute("error");
                    return "manageView";
                }
                session.setAttribute("error","账号或密码错误");
                return "../../index";
        }
       return null;
    }

    @RequestMapping("/register")//游客注册
    public String register(User user, HttpSession session) throws Exception{
        session.removeAttribute("error2");
        User user1 = userService.register(user);
        if (null==user1){
            userService.save(user);
            return "../../index";
        }
        session.setAttribute("error2","用户名重复");
        return "../../index";
    }
    @RequestMapping("/userUpdatePass")
    public String userUpdatePass(){
        return "userUpdatePass";
    }

    @RequestMapping("/userUpdatePass1")//user修改密码
    public String userUpdatePass1(String pass2,HttpSession session){
        User user1= (User) session.getAttribute("user");//new password
        user1.setUser_pass(pass2);//当前用户
        userService.updatePass(user1);//通过用户名修改
        session.removeAttribute("user");//重新登录
        return "userUpdatePass";
    }
}
