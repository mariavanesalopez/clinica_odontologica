package com.proyecto.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "Turns")
public class Turn {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name= "patient_id", nullable = false)
    private Patient patient;
    @ManyToOne
    @JoinColumn(name="dentist_id", nullable = false)
    private Dentist dentist;
    private LocalDateTime turn;

    public Turn() {
    }

    public Turn(Patient patient, Dentist dentist, LocalDateTime turn) {
        this.patient = patient;
        this.dentist = dentist;
        this.turn = turn;
    }

    public Turn(Long id, Patient patient, Dentist dentist, LocalDateTime turn) {
        this.id = id;
        this.patient = patient;
        this.dentist = dentist;
        this.turn = turn;
    }

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
