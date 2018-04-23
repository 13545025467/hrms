package com.lv.controller;

import com.lv.dao.RecruitMapper;
import com.lv.model.Recruit;
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
    private RecruitMapper recruitMapper;
    @Resource
    private Recruit recruit;
    @RequestMapping("/recruitDetails")//点击查看详情后显示这个职位的具体信息
    public String recruitDetails(String rec_id,HttpSession session){
        recruit.setRec_id(Integer.parseInt(rec_id));
        Recruit recruit1= recruitMapper.getRecruitById(recruit);
        System.out.println(recruit1);
        session.setAttribute("recruitDetails",recruit1);
        return "recruitDetails";
    }

    @RequestMapping("/selectRecruit")//浏览招聘信息
    public String selectRecruit(HttpSession session){
        Set<Recruit> list=recruitMapper.getRecruits();
        session.setAttribute("recruits",list);
        return "recruit";
    }


}
