package com.example.healspan;

import com.example.healspan.domain.Healspan;
import com.example.healspan.persistence.dao.jpa.HealspanDAO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class testHealspanDAO {
    @Autowired
    private HealspanDAO healspanDAO;

    @Test
    public void testFindAll() {
        List<Healspan> allHealspans = healspanDAO.findAll();
        // Assert or log the results to verify if the data is retrieved correctly
        // For example:
        System.out.println(allHealspans);
    }

    @Test
    public void testFindByStage() {
        String stage = "Initial Authorization";
        List<Healspan> healspansByStage = healspanDAO.findByStage(stage);
        // Assert or log the results to verify if the data is retrieved correctly
        // For example:
        System.out.println(healspansByStage);
    }

    @Test
    public void testFindByStatus() {
        String status = "Pending Approval";
        List<Healspan> healspansByStatus = healspanDAO.findByStatus(status);
        // Assert or log the results to verify if the data is retrieved correctly
        // For example:
        System.out.println(healspansByStatus);
    }

    @Test
    public void testFindByStageAndStatus() {
        String stage = "Initial Authorization";
        String status = "Pending Approval";
        List<Healspan> healspansByStageAndStatus = healspanDAO.findByStageAndStatus(stage, status);
        // Assert or log the results to verify if the data is retrieved correctly
        // For example:
        System.out.println(healspansByStageAndStatus);
    }
}
