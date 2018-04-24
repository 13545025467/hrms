package com.lv.controller;

import com.lv.model.Dept;
import com.lv.model.Post;
import com.lv.service.DeptService;
import com.lv.service.PostService;
import com.lv.util.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
@Controller
public class DeptController {
    @Resource
    private Dept dept;
    @Resource
    private DeptService deptService;
    @Resource
    private Post post;
    @Resource
    private PostService postService;
    @RequestMapping("/addDept")//创建部门
    public String addDept(String deptName, HttpSession session){
        System.out.println(deptName);
        System.out.println("66666666666");
        dept.setDept_name(deptName);
        if (deptService.getDeptByName(dept)==null){
            System.out.println("没有重复部门，可以添加");
            String datetime=new DateTime().getDate();
            dept.setDept_createtime(datetime);
            System.out.println(dept);
            deptService.saveDept(dept);
            System.out.println("44444444");
        }
        session.removeAttribute("depts");
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("depts",depts);
        return "../../manageleft";
    }
    @RequestMapping("/updateDeptName")
    public String updateDeptName(HttpSession session){
        session.removeAttribute("depts");
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("dept",depts);
        return "updateDeptName";
    }
    @RequestMapping("/updateDept")//部门修改
    public String updateDept(Dept dept, HttpSession session){
        System.out.println(dept);
        if (deptService.getDeptByName(dept)==null){
            System.out.println("没有重复部门，可以修改");
            deptService.updateDept(dept);
        }
        session.removeAttribute("depts");
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("depts",depts);
        return "mSelectDept";
    }

    @RequestMapping("/getAllDept")//查看全部部门
    public String getAllDept(HttpSession session){
        session.removeAttribute("depts");
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("depts",depts);
        return "mSelectDept";
    }

    @RequestMapping("/deleteDept")//删除部门
    public String deleteDept(Dept dept,HttpSession session){
        //要先从职位表中查询，该部门下没有职位则可以删除

        deptService.deleteDept(dept);
        session.removeAttribute("depts");
        Set<Dept> depts=deptService.getAllDept();
        session.setAttribute("depts",depts);
        return "mSelectDept";
    }

    @ResourceMapping("/addPost")
    public String addPost(Post post,HttpSession session){
        if(postService.getPostByNameAndDept(post)==null){
            System.out.println("该部门下没有同名的职位，可以添加");
            postService.savePost(post);
        }
        //页面显示时应该显示部门的名称而不是部门的编号
        Set<Post> posts=postService.getAllPost();
        return "";
    }
    @RequestMapping("/updatePost")
    public String updatePost(Post post,HttpSession session){
        if(postService.getPostByNameAndDept(post)==null){
            System.out.println("该部门下没有同名的职位，可以添加");
            postService.updatePost(post);
        }
        //页面显示时应该显示部门的名称而不是部门的编号
        Set<Post> posts=postService.getAllPost();
        return "";
    }

    @RequestMapping("/getAllPost")
    public String getAllPost(HttpSession session){
        Set<Post> posts=postService.getAllPost();
        session.setAttribute("posts",posts);
        return "";
    }

    @RequestMapping("/getPostByDept")
    public String getPostByDept(Dept dept,HttpSession session){
        //根据部门的id和职位表中的部门id相等来查该部门下的所有职位
        //也可以传递Post过过来
        Set<Post> posts=postService.getPostByDept(dept);
        session.setAttribute("postByDept",posts);
        return "";
    }

    @RequestMapping("deletePost")
    public String deletePost(Post post,HttpSession session){
        //删除之前要先判断该职位下有没有职工，如果有的话则不能删除
        postService.deletePost(post);
        return "";
    }
}
