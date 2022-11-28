package com.proyecto.service;

import com.proyecto.entity.Patient;
import com.proyecto.entity.PatientDto;

import java.util.Set;

public interface IPatientService {
    void createPatient(PatientDto patientDto);
    PatientDto readPatient(Long id);
    void changePatient(PatientDto patientDto);
    void removePatient(Long id);
    Set<PatientDto> getAll();
}
