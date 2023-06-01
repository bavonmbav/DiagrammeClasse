package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Appointement;
import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.repository.AppointementRepository;
import com.systeme.gestion.service.AppointementServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointementImp implements AppointementServiceIT {
    @Autowired
    private AppointementRepository repository;
    @Override
    public Appointement createAppointment(Appointement appointment) {
        return repository.save(appointment);
    }

    @Override
    public Appointement getAppointmentById(Long id) {
        // Logique pour obtenir un rendez-vous par son ID
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Appointement> getAllAppointments() {
        // Logique pour obtenir tous les rendez-vous
        return (List<Appointement>) repository.findAll();
    }

    @Override
    public List<Appointement> getAppointmentsByUser(Utilisateur user) {
        // Logique pour obtenir les rendez-vous d'un utilisateur donné
        return repository.findByUtilisateur(user);
    }

    @Override
    public List<Appointement> getAppointmentsByDate(String date) {
        // Logique pour obtenir les rendez-vous pour une date donnée
        return repository.findByNotes(date);
    }

    @Override
    public void deleteAppointment(Long id) {
        // Logique pour supprimer un rendez-vous par son ID
        repository.deleteById(id);
    }
}


