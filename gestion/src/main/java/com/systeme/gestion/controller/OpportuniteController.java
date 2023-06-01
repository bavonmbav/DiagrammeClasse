package com.systeme.gestion.controller;

import com.systeme.gestion.entity.EtapeProgression;
import com.systeme.gestion.entity.Opportunite;
import com.systeme.gestion.entity.OpportuniteDTO;
import com.systeme.gestion.service.OpportuniteServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opportunites")
public class OpportuniteController {
    @Autowired
    private  OpportuniteServiceIT opportuniteService;

    @PostMapping
    public void creerOpportunite(@RequestBody Opportunite opportuniteDTO) {
         opportuniteService.creerOpportunite(opportuniteDTO);
    }

    @PutMapping("/{opportuniteId}/attribution/{membreId}")
    public ResponseEntity<Opportunite> attribuerOpportunite(
            @PathVariable Long opportuniteId,
            @PathVariable Long membreId
    ) {
        Opportunite opportunite = opportuniteService.attribuerOpportunite(opportuniteId, membreId);
        return ResponseEntity.ok(opportunite);
    }

    @PutMapping("/{opportuniteId}/note")
    public ResponseEntity<Opportunite> ajouterNote(@PathVariable Long opportuniteId, @RequestBody String note) {
        Opportunite opportunite = opportuniteService.ajouterNote(opportuniteId, note);
        return ResponseEntity.ok(opportunite);
    }

    @PutMapping("/{opportuniteId}/etape")
    public ResponseEntity<Opportunite> definirEtape(
            @PathVariable Long opportuniteId,
            @RequestBody EtapeProgression etape
    ) {
        Opportunite opportunite = opportuniteService.definirEtape(opportuniteId, etape);
        return ResponseEntity.ok(opportunite);
    }

    @GetMapping
    public ResponseEntity<List<Opportunite>> obtenirOpportunites() {
        List<Opportunite> opportunites = opportuniteService.obtenirOpportunites();
        return ResponseEntity.ok(opportunites);
    }

    @GetMapping("/membre/{membreId}")
    public ResponseEntity<List<Opportunite>> obtenirOpportunitesParMembre(@PathVariable Long membreId) {
        List<Opportunite> opportunites = opportuniteService.obtenirOpportunitesParMembre(membreId);
        return ResponseEntity.ok(opportunites);
    }

    @GetMapping("/encours")
    public ResponseEntity<List<Opportunite>> obtenirOpportunitesEnCours() {
        List<Opportunite> opportunites = opportuniteService.obtenirOpportunitesEnCours();
        return ResponseEntity.ok(opportunites);
    }

    @GetMapping("/conclues")
    public ResponseEntity<List<Opportunite>> obtenirOpportunitesConclues() {
        List<Opportunite> opportunites = opportuniteService.obtenirOpportunitesConclues();
        return ResponseEntity.ok(opportunites);
    }
}
