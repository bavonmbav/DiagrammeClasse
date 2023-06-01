package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Tache;
import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.repository.TacheRepository;
import com.systeme.gestion.service.TacheServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheImp implements TacheServiceIT {
    @Autowired
    private TacheRepository repository;

    @Override
    public Tache createTask(Tache task) {
        return repository.save(task);
    }
/// recherche par id
    @Override
    public Tache getTaskById(Long id) {
        return repository.findById(id).orElse(null);
    }
//recheche toutes les taches
    @Override
    public List<Tache> getAllTasks() {
        return (List<Tache>) repository.findAll();
    }
//    recherche par utilisateur
    @Override
    public List<Tache> getTasksByUser(Utilisateur user) {
        return repository.findByUtilisateur(user);
    }

    @Override
    public void assignTaskToUser(Tache task, Utilisateur user) {
        task.setUtilisateur(user);
        repository.save(task);
    }

    @Override
    public void completeTask(Tache task) {
        task.setCompleted(true);
        repository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
