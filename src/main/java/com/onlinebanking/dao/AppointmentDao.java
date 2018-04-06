package com.onlinebanking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinebanking.model.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
