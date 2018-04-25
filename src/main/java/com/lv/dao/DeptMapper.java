package com.lv.dao;

import com.lv.model.Dept;

import java.util.List;
import java.util.Set;

/**
 * Created by xgq on 2018/4/24.
 */
public interface DeptMapper {
    Dept getDeptByName(Dept dept);
    List<Dept> getAllDept2();
    Set<Dept> getAllDept();
    Dept getDeptById(Dept dept);
    boolean saveDept(Dept dept);
    boolean updateDept(Dept dept);
    boolean deleteDept(Dept dept);
}
