package com.systeme.gestion.service;

import com.systeme.gestion.entity.Appointement;
import com.systeme.gestion.entity.Utilisateur;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointementServiceIT {
    Appointement createAppointment(Appointement appointment);
    Appointement getAppointmentById(Long id);
    List<Appointement> getAllAppointments();
    List<Appointement> getAppointmentsByUser(Utilisateur user);
    List<Appointement> getAppointmentsByDate(String date);
    void deleteAppointment(Long id);
}
