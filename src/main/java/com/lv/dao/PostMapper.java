package com.lv.dao;

import com.lv.model.Dept;
import com.lv.model.Employee;
import com.lv.model.Post;

import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
public interface PostMapper {
    Post getPostByName(Post post);
    Post getPostById(Post post);
    Post getPostByNameAndDept(Post post);
    Post updateGetPostByNameAndDept(Post post);
    Post getPostByEmp(Employee employee);
    Set<Post> getAllPost();
    Set<Post> getPostByDept(Dept dept);
    boolean savePost(Post post);
    boolean updatePost(Post post);
    boolean deletePost(Post post);
}
