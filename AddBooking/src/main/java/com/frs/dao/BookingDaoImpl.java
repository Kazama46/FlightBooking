package com.frs.dao;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.frs.dto.Booking;

public interface BookingDaoImpl extends CrudRepository<Booking, Integer>{



}
