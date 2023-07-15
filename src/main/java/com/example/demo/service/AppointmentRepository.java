package com.example.demo.service;

import com.example.demo.entities.Appointment;

import java.util.List;

public class AppointmentRepository {
    private final AppointmentRepository appointmentRepository;

    public AppointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepository.getAppointmentById(id);
    }

    public void createAppointment(Appointment doctor) {
        appointmentRepository.createAppointment(doctor);
    }
}
