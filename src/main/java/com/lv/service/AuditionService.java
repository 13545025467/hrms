package com.lv.service;

import com.lv.model.Audition;
import com.lv.model.Recruit;
import com.lv.model.Resume;

import java.util.Set;

/**
 * Created by xgq on 2018/4/23.
 */
public interface AuditionService {
    Set<Audition> getAudition();
    Audition getAuditionByUser(Resume resume, Recruit recruit);
    Set<Audition> getAuditionUserLook(Resume resume);
    Audition getAuditioinByPost(Resume resume);
    Audition getAuditioinById(Audition audition);
    boolean saveAudition(Audition audition);
    boolean updateAudition(Audition audition);
    boolean deleteAudition(Audition audition);
}
