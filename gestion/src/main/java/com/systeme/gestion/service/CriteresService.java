package com.systeme.gestion.service;

import com.systeme.gestion.entity.Criteres;

import java.util.List;

public interface CriteresService {
    List<Criteres> getAllCriteres();
    Criteres getCriteresById(Long id);
    void saveCriteres(Criteres criteres);
    void deleteCriteres(Long id);
}
