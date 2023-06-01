package com.systeme.gestion.service;

import com.systeme.gestion.entity.Criteres;
import com.systeme.gestion.entity.Rapport;

import java.util.List;

public interface RapportService {
    List<Rapport> genererRapports();
    Rapport genererRapportPersonnalise(Criteres criteres);
}
