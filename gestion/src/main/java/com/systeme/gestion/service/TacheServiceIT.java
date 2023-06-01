package com.systeme.gestion.service;

import com.systeme.gestion.entity.Tache;
import com.systeme.gestion.entity.Utilisateur;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TacheServiceIT {
    Tache createTask(Tache task);
    Tache getTaskById(Long id);
    List<Tache> getAllTasks();
    List<Tache> getTasksByUser(Utilisateur user);
    void assignTaskToUser(Tache task, Utilisateur user);
    void completeTask(Tache task);
    void deleteTask(Long id);
}
