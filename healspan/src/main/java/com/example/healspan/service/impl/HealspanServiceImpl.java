package com.example.healspan.service.impl;

import com.example.healspan.domain.Healspan;
import com.example.healspan.persistence.dao.jpa.HealspanDAO;
import com.example.healspan.service.HealspanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealspanServiceImpl implements HealspanService {
    @Autowired
    private HealspanDAO healspanDAO;
    public HealspanServiceImpl(HealspanDAO healspanDAO) {
        this.healspanDAO = healspanDAO;
    }
    @Override
    public List<Healspan> searchPatients(String stage, String status) {
        if (stage == null && status == null) {
            return healspanDAO.findAll();
        } else if (stage != null && status == null) {
            return healspanDAO.findByStage(stage);
        } else if (stage == null && status != null) {
            return healspanDAO.findByStatus(status);
        } else {
            return healspanDAO.findByStageAndStatus(stage, status);
        }
    }
    public List<Healspan> getByStageAndStatus(String stage, String status) {
        return healspanDAO.findByStageAndStatus(stage, status);
    }
//    public List<Healspan> getByStatus(String status) {
//        return healspanDAO.findByStatus(status);
//    }
//    public List<Healspan> getByStageAndStatus(String stage, String status) {
//        return healspanDAO.findByStageAndStatus(stage, status);
//    }
    @Override
    public Healspan createPatient(Healspan healspan) {
        return healspanDAO.save(healspan);
    }
}
