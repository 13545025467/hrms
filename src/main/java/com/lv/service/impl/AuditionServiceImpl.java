package com.lv.service.impl;

import com.lv.dao.AuditionMapper;
import com.lv.model.Audition;
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

    public Set<Audition> getAuditionByUser(Resume resume) {
        return auditionMapper.getAuditionByUser(resume);
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
