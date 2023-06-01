package com.systeme.gestion.implement;

import com.systeme.gestion.entity.EtapeProgression;
import com.systeme.gestion.entity.EtatOpportunite;
import com.systeme.gestion.entity.Opportunite;
import com.systeme.gestion.entity.OpportuniteDTO;
import com.systeme.gestion.repository.OpportuniteRepository;
import com.systeme.gestion.service.OpportuniteServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpportuniteImp implements OpportuniteServiceIT {
    @Autowired
    private OpportuniteRepository opportuniteRepository;
    //opportuniteRepository.save(opportunite);
    @Override
    public void creerOpportunite(Opportunite opportuniteDTO) {
        opportuniteRepository.save(opportuniteDTO);
    }

    @Override
    public Opportunite attribuerOpportunite(Long opportuniteId, Long membreId) {
        Opportunite opportunite = opportuniteRepository.findById(opportuniteId).orElseThrow();
        // Logique d'attribution de l'opportunité à un membre de l'équipe en utilisant le membreId
        opportunite.setEtat(EtatOpportunite.EN_COURS);

        return opportuniteRepository.save(opportunite);

    }

    @Override
    public Opportunite ajouterNote(Long opportuniteId, String note) {
        Opportunite opportunite = opportuniteRepository.findById(opportuniteId).orElseThrow();
        // Logique d'ajout de note à l'opportunité en utilisant la note

        return opportuniteRepository.save(opportunite);
    }

    @Override
    public Opportunite definirEtape(Long opportuniteId, EtapeProgression etape) {
        Opportunite opportunite = opportuniteRepository.findById(opportuniteId).orElseThrow();
        opportunite.setEtapeProgression(etape);

        return opportuniteRepository.save(opportunite);
    }

    @Override
    public List<Opportunite> obtenirOpportunites() {
        return (List<Opportunite>) opportuniteRepository.findAll();
    }

    @Override
    public List<Opportunite> obtenirOpportunitesParMembre(Long membreId) {
        //complete la Logique pour obtenir les opportunités attribuées à un membre de l'équipe en utilisant le membreId

        return opportuniteRepository.findByMembreId(membreId);
    }

    @Override
    public List<Opportunite> obtenirOpportunitesEnCours() {
        return opportuniteRepository.findByEtat(EtatOpportunite.EN_COURS);
    }

    @Override
    public List<Opportunite> obtenirOpportunitesConclues() {
        return opportuniteRepository.findByEtat(EtatOpportunite.CONCLUE);
    }
}
