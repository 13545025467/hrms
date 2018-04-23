package com.lv.dao;

import com.lv.model.Audition;
import com.lv.model.Resume;

import java.util.Set;

/**
 * Created by xgq on 2018/4/23.
 */
public interface AuditionMapper {
    Set<Audition> getAudition();
    Set<Audition> getAuditionByUser(Resume resume);
    boolean saveAudition(Audition audition);
    boolean updateAudition(Audition audition);
    boolean deleteAudition(Audition audition);
}
