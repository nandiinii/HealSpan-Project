package com.example.healspan.service;


import com.example.healspan.domain.Healspan;

import java.util.List;

public interface HealspanService {
    List<Healspan> searchPatients(String Stage,String status);
    Healspan createPatient(Healspan patient);
}
