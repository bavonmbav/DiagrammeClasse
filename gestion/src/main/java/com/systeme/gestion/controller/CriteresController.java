package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Criteres;
import com.systeme.gestion.service.CriteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criteres")
public class CriteresController {
    @Autowired
    private  CriteresService criteresService;

    @GetMapping
    public List<Criteres> getAllCriteres() {
        return criteresService.getAllCriteres();
    }

    @GetMapping("/{id}")
    public Criteres getCriteresById(@PathVariable Long id) {
        return criteresService.getCriteresById(id);
    }

    @PostMapping
    public void saveCriteres(@RequestBody Criteres criteres) {
        criteresService.saveCriteres(criteres);
    }

    @DeleteMapping("/{id}")
    public void deleteCriteres(@PathVariable Long id) {
        criteresService.deleteCriteres(id);
    }
}

