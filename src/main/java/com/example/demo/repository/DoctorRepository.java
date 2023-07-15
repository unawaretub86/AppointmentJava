package com.example.demo.repository;

import com.example.demo.entities.Doctor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor getDoctorById(long id);

    List<Doctor> getAllDoctors();

    <S extends Doctor> S createDoctor(S doctor);
}
