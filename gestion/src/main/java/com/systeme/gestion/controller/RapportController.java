package com.systeme.gestion.controller;

// Import des packages nécessaires
import com.systeme.gestion.entity.Criteres;
import com.systeme.gestion.entity.Rapport;
import com.systeme.gestion.service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotation pour spécifier qu'il s'agit d'un contrôleur Spring MVC
@RestController
public class RapportController {

    // Injection de la dépendance de la classe de service
    @Autowired
    private RapportService rapportService;

    // Point d'entrée pour générer les rapports
    @GetMapping("/rapports")
    public List<Rapport> genererRapports() {
        return (List<Rapport>) rapportService.genererRapports();
    }

    // Point d'entrée pour générer un rapport personnalisé
    @GetMapping("/rapports/personnalises")
    public Rapport genererRapportPersonnalise(@RequestParam Criteres criteres) {
        return rapportService.genererRapportPersonnalise(criteres);
    }
}
