package com.lv.controller;

import com.lv.model.Dept;
import com.lv.model.Post;
import com.lv.model.Recruit;
import com.lv.service.DeptService;
import com.lv.service.PostService;
import com.lv.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Set;

/**
 * Created by xgq on 2018/4/21.
 */
@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @Resource
    private Recruit recruit;
    @Resource
    private DeptService deptService;
    @Resource
    private PostService postService;
    @Resource
    private Dept dept;
    @RequestMapping("/recruitDetails")//点击查看详情后显示这个职位的具体信息
    public String recruitDetails(String rec_id,HttpSession session){
        recruit.setRec_id(Integer.parseInt(rec_id));
        Recruit recruit1= recruitService.getRecruitById(recruit);
        System.out.println(recruit1);
        session.setAttribute("recruitDetails",recruit1);
        return "recruitDetails";
    }

    @RequestMapping("/selectRecruit")//游客浏览招聘信息
    public String selectRecruit(HttpSession session){
        Set<Recruit> list=recruitService.getRecruits();
        session.setAttribute("recruits",list);
        return "recruit";
    }

    @RequestMapping("/addRecruit")
    public String addRecruit(HttpSession session){
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("depts1",depts);
        return "addRecruit1";
    }
    @RequestMapping("/addRecruit2")
    public String addRecruit2(String id,HttpSession session){
        try {
            System.out.println(Integer.parseInt(id));
            dept.setDept_id(Integer.parseInt(id));
            Set<Post> posts=postService.getPostByDept(dept);
            session.setAttribute("posts",posts);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return "addRecruit";
    }
    @RequestMapping("/addRecruitDetails")//管理员发布招聘信息
    public String addRecruitDetails(Recruit recruit,HttpSession session){
        System.out.println(recruit);
        Recruit recruit1=recruitService.getRecruitByName(recruit);
        if (recruit1==null){//没有发布相同职位的简历，则可以发布
            recruit.setRec_state("未发布");
            recruitService.saveRecruit(recruit);
        }
        return "addRecruit";
    }
    @RequestMapping("/mSelectRecruit")//管理员浏览招聘信息
    public String mSelectRecruit(HttpSession session){
        Set<Recruit> list=recruitService.getAllRecruits();
        session.setAttribute("allRecruits",list);
        return "mSelectRecruit";
    }

    @RequestMapping("/mSelectRecruitDetails")//管理员查看招聘信息的具体信息
    public String mSelectRecruitDetails(String rec_id,HttpSession session){
        recruit.setRec_id(Integer.parseInt(rec_id));
        Recruit recruit1= recruitService.getRecruitById(recruit);
        session.setAttribute("mRecruitDetails",recruit1);
        return "mSelectRecruitDetails";
    }

    @RequestMapping("/mDeleteRecruit")//管理员删除招聘信息
    public String mDeleteRecruit(String rec_id,HttpSession session){
        recruit.setRec_id(Integer.parseInt(rec_id));
        recruitService.deleteRecruit(recruit);
        Set<Recruit> list=recruitService.getAllRecruits();//删除完成后返回查看招聘信息的页面
       session.setAttribute("allRecruits",list);
        return "mSelectRecruit";
    }
    @RequestMapping("/mUpdateRecruit")//管理员修改招聘信息，要跳转到修改信息的界面
    public String mUpdateRecruit(String rec_id,HttpSession session){
        recruit.setRec_id(Integer.parseInt(rec_id));
        Recruit recruit1= recruitService.getRecruitById(recruit);
        session.setAttribute("mUpdateDetails",recruit1);
        return "mUpdateRecruit";
    }

    @RequestMapping("/mUpdateRecruits")//管理员修改招聘信息，表单提交
    public String mUpdateRecruits(Recruit recruit,HttpSession session){
       recruitService.updateRecruit(recruit);
        System.out.println("修改成功");
        Recruit recruit1= recruitService.getRecruitById(recruit);
        session.setAttribute("mRecruitDetails",recruit1);
        return "mSelectRecruitDetails";
    }
}
