package com.lv.controller;

import com.lv.model.Dept;
import com.lv.model.Post;
import com.lv.service.DeptService;
import com.lv.service.PostService;
import com.lv.util.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        if (deptName==""||deptName==null){
            return "../../manageleft";
        }
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
        Dept dept1=deptService.getDeptById(dept);
        System.out.println(dept1);
        dept1.setDept_name(dept.getDept_name());
        if (deptService.getDeptByName(dept)==null){
            System.out.println("没有重复部门，可以修改");
            deptService.updateDept(dept1);
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

    @RequestMapping("/addAndUpdate")//无用
    public String addAndUpdate(String dept_id,HttpSession session){
        session.removeAttribute("deptid");
        int id=Integer.parseInt(dept_id);
        session.setAttribute("deptid",id);
        if (id==1){
            session.setAttribute("deptid",id);
            return "addPost";
        }
        return "";
    }
    @RequestMapping("/addPost1")
        public String addPost1(String dept_id,HttpSession session){
        int id=Integer.parseInt(dept_id);
        session.setAttribute("deptid",id);
            return "addPost";
    }
    @RequestMapping("/addPost")
    public String addPost(String post_name,String post_sal,String dept_id,HttpSession session){

        try {
            post.setPost_sal(Double.parseDouble(post_sal));
            post.setPost_title(post_name);
            dept.setDept_id(Integer.parseInt(dept_id));
            post.setDept(dept);
            if(postService.getPostByNameAndDept(post)==null){
                System.out.println("该部门下没有同名的职位，可以添加");
                postService.savePost(post);
            }
        } catch (NumberFormatException e) {

        }
        //页面显示时应该显示部门的名称而不是部门的编号
//        Set<Post> posts=postService.getAllPost();
        return "mSelectDept";
    }

       @RequestMapping("/updatePost")
        public String updatePost(String name,String post_sal,String post_id,HttpSession session){
           double sal=Double.parseDouble(post_sal);
        Post post1=new Post();
        post1.setPost_id(Integer.parseInt(post_id));
        Post post2=postService.getPostById(post1);
        if(post2.getPost_title().equals(name)){
            if(sal<2000){
                Post post=new Post();
                post.setPost_id(Integer.parseInt(post_id));
                post.setPost_title(name);
                post.setPost_sal(2000);
                Dept dept1=(Dept) session.getAttribute("dept12");
                post.setDept(dept1);
                postService.updatePost(post);
            }else {
                Post post=new Post();
                post.setPost_id(Integer.parseInt(post_id));
                post.setPost_title(name);
                post.setPost_sal(sal);
                Dept dept1=(Dept) session.getAttribute("dept12");
                post.setDept(dept1);
                postService.updatePost(post);
            }
            Dept dept1=(Dept) session.getAttribute("dept12");
            Set<Post> posts=postService.getPostByDept(dept1);
            session.setAttribute("postByDept",posts);
            return "allPostByDept";
        }

        if(sal<2000) {
            Post post=new Post();
            post.setPost_id(Integer.parseInt(post_id));
            post.setPost_title(name);
            post.setPost_sal(2000);
            Dept dept2=(Dept) session.getAttribute("dept12");
            post.setDept(dept2);
            System.out.println(post);
            if(postService.updateGetPostByNameAndDept(post)==null){
                System.out.println("该部门下没有同名的职位，可以修改");
                postService.updatePost(post);
            }
        }else {
            Post post=new Post();
            post.setPost_id(Integer.parseInt(post_id));
            post.setPost_title(name);
            post.setPost_sal(sal);
            Dept dept2=(Dept) session.getAttribute("dept12");
            post.setDept(dept2);
            System.out.println(post);
            if(postService.updateGetPostByNameAndDept(post)==null){
                System.out.println("该部门下没有同名的职位，可以修改");
                postService.updatePost(post);
            }
        }
           Dept dept2=(Dept) session.getAttribute("dept12");
           Set<Post> posts1=postService.getPostByDept(dept2);
           session.setAttribute("postByDept",posts1);
        return "allPostByDept";
    }

    @RequestMapping("/getAllPost")
    public String getAllPost(HttpSession session){
        Set<Post> posts=postService.getAllPost();
        session.setAttribute("posts",posts);
        return "";
    }

    @RequestMapping("/getPostByDept")
    public String getPostByDept(String dept_id,HttpSession session){
        //根据部门的id和职位表中的部门id相等来查该部门下的所有职位
        //也可以传递Post过过来
        dept.setDept_id(Integer.parseInt(dept_id));
        int id=Integer.parseInt(dept_id);
        System.out.println(id);
        Dept dept1=new Dept();
        dept1.setDept_id(id);
        Dept dept2=deptService.getDeptById(dept1);
        session.setAttribute("dept12",dept2);
        System.out.println(dept2);
        Set<Post> posts=postService.getPostByDept(dept);
        session.setAttribute("postByDept",posts);
        return "allPostByDept";
    }

    @RequestMapping("deletePost")
    public String deletePost(String post_id,HttpSession session){
        //删除之前要先判断该职位下有没有职工，如果有的话则不能删除
        Post post=new Post();
        post.setPost_id(Integer.parseInt(post_id));
        Post post1=postService.getPostById(post);
        System.out.println(post1);
        postService.deletePost(post);
        Dept dept1=(Dept) session.getAttribute("dept12");
        Set<Post> posts=postService.getPostByDept(dept1);
        session.setAttribute("postByDept",posts);
        return "allPostByDept";
    }
}
