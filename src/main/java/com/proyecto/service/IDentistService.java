package com.proyecto.service;


import com.proyecto.entity.DentistDto;

import java.util.Set;

public interface IDentistService {

    void createDentist(DentistDto dentistDto);

    DentistDto readDentist(Long id);

    void changeDentist(DentistDto dentistDto);

    void removeDentist(Long id);

    Set<DentistDto> getAll();
}
