package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Appointement;
import com.systeme.gestion.entity.Utilisateur;
import com.systeme.gestion.service.AppointementServiceIT;
import com.systeme.gestion.service.UserServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/rendez-vous")
public class AppointementController {
    @Autowired
    private AppointementServiceIT appointmentService;
    @Autowired
    private UserServiceIT serviceIT;

    @PostMapping
    public Appointement createAppointment(@RequestBody Appointement appointment) {
        // Appeler le service pour créer un rendez-vous
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointement getAppointmentById(@PathVariable Long id) {
        // Appeler le service pour obtenir un rendez-vous par son ID
        return appointmentService.getAppointmentById(id);
    }

    @GetMapping
    public List<Appointement> getAllAppointments() {
        // Appeler le service pour obtenir tous les rendez-vous
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/user/{userId}")
    public List<Appointement> getAppointmentsByUser(@PathVariable Long userId) {
        // Appeler le service pour obtenir les rendez-vous d'un utilisateur donné
        Utilisateur user = serviceIT.getUserById(userId);
        return appointmentService.getAppointmentsByUser(user);
    }

    @GetMapping("/date/{date}")
    public List<Appointement> getAppointmentsByDate(@PathVariable String date) {
        // Appeler le service pour obtenir les rendez-vous pour une date donnée
        return appointmentService.getAppointmentsByDate(date);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        // Appeler le service pour supprimer un rendez-vous par son ID
        appointmentService.deleteAppointment(id);
    }
}