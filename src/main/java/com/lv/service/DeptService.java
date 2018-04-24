package com.lv.service;

import com.lv.model.Dept;

import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
public interface DeptService {
    Dept getDeptByName(Dept dept);
    Set<Dept> getAllDept();
    boolean saveDept(Dept dept);
    boolean updateDept(Dept dept);
    boolean deleteDept(Dept dept);
}
