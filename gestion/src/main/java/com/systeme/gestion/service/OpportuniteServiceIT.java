package com.systeme.gestion.service;

import com.systeme.gestion.entity.EtapeProgression;
import com.systeme.gestion.entity.Opportunite;
import com.systeme.gestion.entity.OpportuniteDTO;

import java.util.List;

public interface OpportuniteServiceIT {
    void creerOpportunite(Opportunite opportuniteDTO);
    Opportunite attribuerOpportunite(Long opportuniteId, Long membreId);
    Opportunite ajouterNote(Long opportuniteId, String note);
    Opportunite definirEtape(Long opportuniteId, EtapeProgression etape);
    List<Opportunite> obtenirOpportunites();
    List<Opportunite> obtenirOpportunitesParMembre(Long membreId);
    List<Opportunite> obtenirOpportunitesEnCours();
    List<Opportunite> obtenirOpportunitesConclues();
}
