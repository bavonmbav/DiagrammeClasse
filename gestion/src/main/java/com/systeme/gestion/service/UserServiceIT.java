package com.systeme.gestion.service;

import com.systeme.gestion.entity.Utilisateur;

import java.util.List;

public interface UserServiceIT {
    Utilisateur createUser(Utilisateur user);

    Utilisateur getUserById(Long id);

    List<Utilisateur> getAllUsers();

    void deleteUser(Long id);
}
