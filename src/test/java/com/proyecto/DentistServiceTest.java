package com.proyecto;

import com.proyecto.entity.Dentist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DentistServiceTest {
    @Test
    public void tuitionValid_ReturnFalse() {
        //GIVEN
        Dentist dentist = new Dentist(1L, "maria", "perez", "1k");

        //WHEN
        boolean response = dentist.tuitionValid();

        //THEN
        Assertions.assertFalse(response);

    }

    @Test
    public void tuitionValid_ReturnTrue() {
        //GIVEN
        Dentist dentist2 = new Dentist(2L, "florencia", "luna", "4567");

        //WHEN
        boolean response = dentist2.tuitionValid();

        //THEN
        Assertions.assertTrue(response);
    }
}
