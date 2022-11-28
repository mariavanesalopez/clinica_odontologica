package com.proyecto.controller;

import com.proyecto.entity.PatientDto;
import com.proyecto.entity.TurnDto;
import com.proyecto.service.IPatientService;
import com.proyecto.service.ITurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turns")
public class TurnController {
    @Autowired
    ITurnService turnService;

    @PostMapping
    public ResponseEntity<?> createTurn(@RequestBody TurnDto turnDto) {
        turnService.createTurn(turnDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnDto getTurn(@PathVariable Long id){
        return turnService.readTurn(id);
    }

    @PutMapping
    public ResponseEntity<?> changeTurn(@RequestBody TurnDto turnDto){
        turnService.changeTurn(turnDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTurn(@PathVariable Long id){
        turnService.removeTurn(id);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping
    public Collection<TurnDto> getAllTurn(){
        return turnService.getAll();
    }
}
