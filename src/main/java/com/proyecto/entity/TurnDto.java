package com.proyecto.entity;

import java.time.LocalDateTime;

public class TurnDto {
    private Long id;
    private Patient patient;
    private Dentist dentist;
    private LocalDateTime turn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public LocalDateTime getTurn() {
        return turn;
    }

    public void setTurn(LocalDateTime turn) {
        this.turn = turn;
    }
}
