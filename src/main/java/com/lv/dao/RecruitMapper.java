package com.lv.dao;

import com.lv.model.Recruit;

import java.util.Set;

/**
 * Created by xgq on 2018/4/21.
 */
public interface RecruitMapper {
    Set<Recruit> getRecruits();//浏览招聘信息
    Recruit getRecruitById(Recruit recruit);//根据id查
    boolean deleteRecruit(Recruit recruit);//删除
    boolean saveRecruit(Recruit recruit);//新增
    boolean updateRecruit(Recruit recruit);//修改
}