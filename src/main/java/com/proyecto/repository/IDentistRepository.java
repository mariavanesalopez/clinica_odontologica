package com.proyecto.repository;

import com.proyecto.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDentistRepository extends JpaRepository<Dentist, Long> {
}
