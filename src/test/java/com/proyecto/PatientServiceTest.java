package com.proyecto;


import com.proyecto.entity.Patient;
import com.proyecto.entity.PatientDto;
import com.proyecto.service.IPatientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private IPatientService patientService;

    @Test
    public void testCreatePatient(){
        PatientDto patientDto = new PatientDto();
        patientDto.setName("Emi");
        patientDto.setSurname("Calvo");
        patientService.createPatient(patientDto);
        PatientDto patientDto1 = patientService.readPatient(1L);

        Assertions.assertTrue(patientDto1 !=null);
    }

    @Test
    public void DniIsPositive_ReturnTrue() {
        //GIVEN
        Patient patient1 = new Patient(1L, "ileana", "macci", 14144144, "castro barros 200", LocalDate.now());

        //WHEN
        boolean response = patient1.dniValid();

        //THEN
        Assertions.assertTrue(response);
    }

    @Test
    public void dniIsNegative_ReturnFalse() {
        //GIVEN
        Patient patient2 = new Patient(2L, "carlos", "juarez", -1, "catamarca 200", LocalDate.now());

        //WHEN
        boolean response = patient2.dniValid();

        //THEN
        Assertions.assertFalse(response);
    }

}
