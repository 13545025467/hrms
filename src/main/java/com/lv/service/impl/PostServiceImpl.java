package com.lv.service.impl;

import com.lv.dao.PostMapper;
import com.lv.model.Dept;
import com.lv.model.Employee;
import com.lv.model.Post;
import com.lv.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostMapper postMapper;
    public Post getPostByName(Post post) {
        return postMapper.getPostByName(post);
    }

    public Post getPostByNameAndDept(Post post) {
        return postMapper.getPostByNameAndDept(post);
    }

    public Post getPostByEmp(Employee employee) {
        return postMapper.getPostByEmp(employee);
    }

    public Set<Post> getAllPost() {
        return postMapper.getAllPost();
    }

    public Set<Post> getPostByDept(Dept dept) {
        return postMapper.getPostByDept(dept);
    }

    public boolean savePost(Post post) {
        postMapper.savePost(post);
        return false;
    }

    public boolean updatePost(Post post) {
        postMapper.updatePost(post);
        return false;
    }

    public boolean deletePost(Post post) {
        postMapper.deletePost(post);
        return false;
    }
}
