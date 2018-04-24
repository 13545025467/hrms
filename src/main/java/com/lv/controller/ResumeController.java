package com.lv.controller;

import com.lv.model.*;
import com.lv.service.*;
import com.lv.util.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @Resource
    private EducationService educationService;
    @Resource
    private ExperienceService experienceService;
    @Resource
    private Education education;
    @Resource
    private Experience experience;
    @Resource
    private Resume resume;
    @Resource
    private User user;
    @Resource
    private UserService userService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private Recruit recruit;
    @Resource
    private Audition audition;
    @Resource
    private AuditionService audi;
    @RequestMapping("/selectResume")//查看简历
    public String selectResume(HttpSession session){
        try {
            user= (User) session.getAttribute("user");
            resume=resumeService.getResume(user);
            education=educationService.getEducation(resume);
            experience=experienceService.getExperience(resume);
        } catch (Exception e) {
            System.out.println("没有登录");
        }

        session.setAttribute("resume",resume);
        session.setAttribute("education",education);
        session.setAttribute("experience",experience);
        return "resume";
    }

    @RequestMapping("/saveResume")//添加简历
    public String saveResume(HttpSession session){
//        user= (User) session.getAttribute("user");
//        resumeService.saveResume(user);
//        session.setAttribute("resume",resume);
        return "saveResume";
    }
    @RequestMapping("/saveResume1")//添加简历
    public String saveResume1(Resume resume, Education education, Experience experience,HttpSession session){
        user= (User) session.getAttribute("user");
        System.out.println(user);
        System.out.println(resume);
        resume.setRes_state("未发布");
        resume.setUser(user);
        System.out.println(resume);
        resumeService.saveResume(resume);
        Resume resume1=resumeService.getResume(user);
        education.setResume(resume1);
        educationService.saveEducation(education);
        experience.setResume(resume1);
        experienceService.saveExperience(experience);
        return "../../index";
    }

    @RequestMapping("/deleteResume")
    public String deleteResume(HttpSession session){
        User user1= (User) session.getAttribute("user");
        Resume resume1=resumeService.getResume(user1);
        educationService.deleteEducation(resume1);
        experienceService.deleteExperience(resume1);
        resumeService.deleteResume(user1);
        return "../../index";
    }

    @RequestMapping("/updateResume")
    public String updateResume(){
        return "updateResume";
    }

    @RequestMapping("/updateResume1")
    public String updateResume1(Resume resume,Education education,Experience experience,HttpSession session){
        System.out.println("*********************");
        User user1= (User) session.getAttribute("user");
        Resume resume1= (Resume) session.getAttribute("resume");
        System.out.println("555555555555");
        education.setResume(resume1);
        resume.setUser(user1);
        experience.setResume(resume1);
        System.out.println(education);
        resumeService.updateResume(resume);
        System.out.println("8888888888888888888888");
        experienceService.updateExperience(experience);
        System.out.println("777777777777777");
        educationService.updateEducation(education);
        System.out.println("66666666666");
        resume=resumeService.getResume(user);
        try {
            education=educationService.getEducation(resume);
            experience=experienceService.getExperience(resume);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        session.setAttribute("resume",resume);
        session.setAttribute("education",education);
        session.setAttribute("experience",experience);
        return "resume";
    }

    @RequestMapping("/submitResume")//提交简历  //个人简历+申请的职位+添加面试邀请
    public String submitResume(String id,HttpSession session){
        System.out.println(Integer.parseInt(id));
        User user= (User) session.getAttribute("user");
        System.out.println("111111222222");
        recruit.setRec_id(Integer.parseInt(id));
        Recruit recruit1=recruitService.getRecruitById(recruit);//得到这条招聘信息
        System.out.println("33333333444444444");
        resume.setUser(user);
        Resume resume1=resumeService.getResume(user);//得到该用户的简历
        System.out.println("4444444455555555");
        resume1.setUser(user);
        resume1.setRes_state("已发布");
        System.out.println(resume1);
        resumeService.updateResume(resume1);//修改简历的状态
        Resume resume2=resumeService.getResume(user);
        resume2.setUser(user);
        //添加面试邀请表
        System.out.println("66666666");
        audition.setResume(resume2);
        audition.setRecruit(recruit1);
        audition.setAudi_post(recruit1.getRec_job());
        audition.setAudi_state(0);
        audi.saveAudition(audition);
        System.out.println("777777777");
        return "recruitDetails";
    }

    @RequestMapping("/intoResume")
    public String inoResume(HttpSession session){//管理员根据简历的状态确定是否投递，并查看已投递的简历
        try {
            resume.setRes_state("已发布");
            Set<Resume> resumes=resumeService.getAll(resume);
            System.out.println(resumes);
            session.setAttribute("intoResume",resumes);
        } catch (Exception e) {
            System.out.write(Integer.parseInt("还没有消息"));
        }
        return "mSelectResume";
    }

    @RequestMapping("resumeDetails")
    public String resumeDetails(String rec_id,HttpSession session){
        //管理员根据要查看的简历id查看详细信息
        resume.setRes_id(Integer.parseInt(rec_id));
        Resume resume1=resumeService.getResumeById(resume);
        experience.setResume(resume1);
        education.setResume(resume1);
        Experience experience1=experienceService.getExperience(resume1);
        Education education1=educationService.getEducation(resume1);
        Audition post=audi.getAuditioinByPost(resume1);
        session.setAttribute("mResume",resume1);
        session.setAttribute("mPost",post);
        session.setAttribute("mExperience",experience1);
        session.setAttribute("mEducation",education1);
        return "mResumeDetails";
    }

    @RequestMapping("/agreeAudition")//通知面试转到编辑页面
    public String agreeAudition(HttpSession session){
        return "mAgreeAudition";
    }

    @RequestMapping("/sendAudition")//管理员发送面试邀请
    public String sendAudition(HttpSession session,Audition audition){
    Resume resume= (Resume) session.getAttribute("mResume");
     Audition audition1 = (Audition) session.getAttribute("mPost");
    audition1.setAudi_local(audition.getAudi_local());
    audition1.setAudi_tel(audition.getAudi_tel());
    audition1.setAudi_time(audition.getAudi_time());
    audition1.setAudi_state(1);
    audi.updateAudition(audition1);
        return "mSelectResume";
    }

    @RequestMapping("/selectAudition")
    public String selectAudition(HttpSession session,Model model){

        try {
            User user1= (User) session.getAttribute("user");
            System.out.println(user1);
            Resume resume=resumeService.getResume(user1);
            System.out.println(resume);
            Set<Audition> getAudition=audi.getAuditionUserLook(resume);
            System.out.println(getAudition);
            session.setAttribute("getAudition",getAudition);
        } catch (Exception e) {
            return "selectAudition";
        }

        System.out.println("请登陆后重试");
            session.setAttribute("notLogin","请登陆后重试");
        return "selectAudition";
    }

    @RequestMapping("/goAudition")//用户同意前去面试
    public  String goAudition(String audi_id,Model model){
        Audition audition1=new Audition();
        audition1.setAudi_id(Integer.parseInt(audi_id));
        if(new DateTime().dateParse(audi.getAuditioinById(audition1).getAudi_time()).after(new DateTime().getDate2())){
            //判断如果管理员发送的面试邀请的时间在你确认前去面试的时间之后则可以去面试
            audition.setAudi_id(Integer.parseInt(audi_id));
            audition.setAudi_state(2);
            audi.updateAudition(audition);
            return "selectAudition";
        }
        Audition audition2=new Audition();
        audition2.setAudi_id(Integer.parseInt(audi_id));
        audition2.setAudi_state(3);
        audi.updateAudition(audition2);
        model.addAttribute("oldTime","已经过了面试时间，请重新投递简历");
           return "selectAudition";
    }
}
