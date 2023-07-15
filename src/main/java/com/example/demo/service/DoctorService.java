package com.example.demo.service;

import com.example.demo.entities.Doctor;
import com.example.demo.repository.DoctorRepository;

import java.util.List;

public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.getAllDoctors();
    }

    public Doctor getDoctorById(int id) {
        return doctorRepository.getDoctorById(id);
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.createDoctor(doctor);
    }
}
