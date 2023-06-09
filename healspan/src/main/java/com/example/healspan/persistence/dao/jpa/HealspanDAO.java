package com.example.healspan.persistence.dao.jpa;

import com.example.healspan.domain.Healspan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HealspanDAO extends MongoRepository<Healspan, String> {
    List<Healspan> findByStage(String stage);
    List<Healspan> findByStatus(String status);
    List<Healspan> findByStageAndStatus(String stage, String status);
}
