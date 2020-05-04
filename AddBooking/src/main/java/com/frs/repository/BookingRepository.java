package com.frs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frs.dto.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{

}
