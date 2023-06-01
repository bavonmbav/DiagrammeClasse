package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Tache;
import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.repository.UserRepository;
import com.systeme.gestion.service.TacheServiceIT;
import com.systeme.gestion.service.UserServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taches")
public class TacheController {
    @Autowired
    private TacheServiceIT serviceIT;

    @Autowired
    private UserServiceIT userRepository;

    @PostMapping
    public Tache createTask(@RequestBody Tache task) {
        // Appel du service pour créer une tâche
        return serviceIT.createTask(task);
    }

    @GetMapping("/{id}")
    public Tache getTaskById(@PathVariable Long id) {
        // Appel du service pour obtenir une tâche par son ID
        return serviceIT.getTaskById(id);
    }

    @GetMapping
    public List<Tache> getAllTasks() {
        // Appel du service pour obtenir toutes les tâches
        return serviceIT.getAllTasks();
    }

    @GetMapping("/user/{userId}")
    public List<Tache> getTasksByUser(@PathVariable Long userId) {
        // Appel du service pour obtenir les tâches d'un utilisateur donné
        Utilisateur utilisateur = serviceIT.getTaskById(userId).getUtilisateur();
        return serviceIT.getTasksByUser(utilisateur);
    }

    @PutMapping("/{taskId}/assign/{userId}")
    public void assignTaskToUser(@PathVariable Long taskId, @PathVariable Long userId) {
        // Appel du service pour attribuer une tâche à un utilisateur
        Tache task = serviceIT.getTaskById(taskId);

        Utilisateur user = userRepository.getUserById(userId);
        serviceIT.assignTaskToUser(task, user);
    }

    @PutMapping("/{id}/complete")
    public void completeTask(@PathVariable Long id) {
        // Appel du service pour marquer une tâche comme terminée
        Tache tache = serviceIT.getTaskById(id);
        serviceIT.completeTask(tache);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        // Appel du service pour supprimer une tâche par son ID
        serviceIT.deleteTask(id);
    }
}
