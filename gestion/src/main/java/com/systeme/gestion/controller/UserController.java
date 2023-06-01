package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.service.UserServiceIT;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceIT userService;

    public UserController(UserServiceIT userService) {
        this.userService = userService;
    }

    @PostMapping
    public Utilisateur createUser(@RequestBody Utilisateur user) {
        // Appeler le service pour créer un utilisateur
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public Utilisateur getUserById(@PathVariable Long id) {
        // Appeler le service pour obtenir un utilisateur par son ID
        return userService.getUserById(id);
    }

    @GetMapping
    public List<Utilisateur> getAllUsers() {
        // Appeler le service pour obtenir tous les utilisateurs
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        // Appeler le service pour supprimer un utilisateur par son ID
        userService.deleteUser(id);
    }
}

