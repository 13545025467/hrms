package com.lv.service.impl;

import com.lv.dao.AuditionMapper;
import com.lv.model.Audition;
import com.lv.model.Recruit;
import com.lv.model.Resume;
import com.lv.service.AuditionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/23.
 */
@Service
public class AuditionServiceImpl implements AuditionService {
    @Resource
    private AuditionMapper auditionMapper;
    public Set<Audition> getAudition() {
        return auditionMapper.getAudition();
    }

    public Audition getAuditionByUser(Resume resume, Recruit recruit) {
        return auditionMapper.getAuditionByUser(resume,recruit);
    }

    public Set<Audition> getAuditionUserLook(Resume resume) {
        return auditionMapper.getAuditionUserLook(resume);
    }

    public Audition getAuditioinByPost(Resume resume) {
        return auditionMapper.getAuditioinByPost(resume);
    }

    public Audition getAuditioinById(Audition audition) {
        return auditionMapper.getAuditioinById(audition);
    }

    public boolean saveAudition(Audition audition) {
        auditionMapper.saveAudition(audition);
        return false;
    }

    public boolean updateAudition(Audition audition) {
        auditionMapper.updateAudition(audition);
        return false;
    }

    public boolean deleteAudition(Audition audition) {
        auditionMapper.deleteAudition(audition);
        return false;
    }
}
