package com.lv.service;

import com.lv.model.Dept;

import java.util.List;
import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
public interface DeptService {
    Dept getDeptByName(Dept dept);
    Set<Dept> getAllDept();
    List<Dept> getAllDept2();
    Dept getDeptById(Dept dept);
    boolean saveDept(Dept dept);
    boolean updateDept(Dept dept);
    boolean deleteDept(Dept dept);
}
