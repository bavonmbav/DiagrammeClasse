package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.repository.UserRepository;
import com.systeme.gestion.service.UserServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserImp implements UserServiceIT {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Utilisateur createUser(Utilisateur user) {
        return userRepository.save(user);
    }

    @Override
    public Utilisateur getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        return (List<Utilisateur>) userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
