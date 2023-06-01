package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Criteres;
import com.systeme.gestion.repository.CriteresRepository;
import com.systeme.gestion.service.CriteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CriteresServiceImpl implements CriteresService {

    @Autowired
    private CriteresRepository criteresRepository;


    @Override
    public List<Criteres> getAllCriteres() {
        return criteresRepository.findAll();
    }

    @Override
    public Criteres getCriteresById(Long id) {
        return criteresRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCriteres(Criteres criteres) {
        criteresRepository.save(criteres);
    }

    @Override
    public void deleteCriteres(Long id) {
        criteresRepository.deleteById(id);
    }
}
