package com.lv.service.impl;

import com.lv.dao.DeptMapper;
import com.lv.model.Dept;
import com.lv.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */@Service
public class DeptServiceImpl implements DeptService {
     @Resource
     private DeptMapper deptMapper;
    public Dept getDeptByName(Dept dept) {
        return deptMapper.getDeptByName(dept);
    }

    public Set<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    public boolean saveDept(Dept dept) {
        deptMapper.saveDept(dept);
        return false;
    }

    public boolean updateDept(Dept dept) {
        deptMapper.updateDept(dept);
        return false;
    }

    public boolean deleteDept(Dept dept) {
        deptMapper.deleteDept(dept);
        return false;
    }
}
