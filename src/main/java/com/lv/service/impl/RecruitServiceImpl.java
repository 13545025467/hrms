package com.lv.service.impl;

import com.lv.dao.RecruitMapper;
import com.lv.model.Recruit;
import com.lv.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/21.
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitMapper recruitMapper;

    public Set<Recruit> getRecruits() {
        return recruitMapper.getRecruits();
    }

    public Set<Recruit> getAllRecruits() {
        return recruitMapper.getAllRecruits();
    }

    public Recruit getRecruitById(Recruit recruit) {
        return recruitMapper.getRecruitById(recruit);
    }

    public Recruit getRecruitByName(Recruit recruit) {
        return recruitMapper.getRecruitByName(recruit);
    }

    public boolean deleteRecruit(Recruit recruit) {
        recruitMapper.deleteRecruit(recruit);
        return false;
    }

    public boolean saveRecruit(Recruit recruit) {
        recruitMapper.saveRecruit(recruit);
        return false;
    }

    public boolean updateRecruit(Recruit recruit) {
        recruitMapper.updateRecruit(recruit);
        return false;
    }
}
