package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment getAppointmentById(long id);

    List<Appointment> getAllAppointments();

    <S extends Appointment> S createAppointment(S appointment);
}
