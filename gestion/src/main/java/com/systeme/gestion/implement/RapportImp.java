package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Criteres;
import com.systeme.gestion.entity.Rapport;
import com.systeme.gestion.repository.RapportRepository;
import com.systeme.gestion.service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RapportImp implements RapportService {
    @Autowired
    private RapportRepository rapportRepository;
    @Override
    public List<Rapport> genererRapports() {
        return (List<Rapport>) rapportRepository.findAll();
    }

    @Override
    public Rapport genererRapportPersonnalise(Criteres criteres) {
        // Logique pour générer un rapport personnalisé en utilisant les critères spécifiés
        // Par exemple, filtrer les rapports en fonction des critères et renvoyer le premier rapport correspondant

        // Obtention des critères de recherche
        String critere1 = criteres.getCritere1();
        Long critere2 = criteres.getCritere2();

        // Logique de recherche dans le repository pour trouver le rapport personnalisé
        List<Rapport> rapports = rapportRepository.findByCritere1AndCritere2(critere1, critere2);
        if (!rapports.isEmpty()) {
            return rapports.get(0);
        }

        return null;
    }
}
