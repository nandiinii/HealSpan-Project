package com.example.healspan.controller;

import com.example.healspan.domain.Healspan;
import com.example.healspan.persistence.dao.jpa.HealspanDAO;
import com.example.healspan.service.HealspanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/healspan")
@CrossOrigin(origins = "http://localhost:3000")
public class HealspanController {
    @Autowired
    private HealspanDAO healspanDAO;
    @Autowired
    private HealspanService healspanService;
    public HealspanController(HealspanService healspanService) {
        this.healspanService = healspanService;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Healspan>> getByStageAndStatus(@RequestParam String stage,
                                         @RequestParam String status) {
        return new ResponseEntity<List<Healspan>>(healspanDAO.findByStageAndStatus(stage, status),HttpStatus.OK);
    }

    @PostMapping("/patients")
    public ResponseEntity<Healspan> createPatient(@RequestBody Healspan patient) {
        Healspan createdPatient = healspanService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }
}
