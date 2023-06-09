package com.example.healspan.domain;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
@Table(name = "patient_records")
public class Healspan {
    @Id
    private String id;

    @Column(name = "claim_id")
    private String claimId;

    @Column(name = "name")
    private String name;

    @Column(name = "ailment")
    private String ailment;

    @Column(name = "sla")
    private int sla;

    @Column(name = "ptat")
    private String ptat;

    @Column(name = "stage")
    private String stage;

    @Column(name = "status")
    private String status;

    @Column(name = "approved_amount")
    private double approvedAmount;

    @Column(name = "hospital")
    private String hospital;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public int getSla() {
        return sla;
    }

    public void setSla(int sla) {
        this.sla = sla;
    }

    public String getPtat() {
        return ptat;
    }

    public void setPtat(String ptat) {
        this.ptat = ptat;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
