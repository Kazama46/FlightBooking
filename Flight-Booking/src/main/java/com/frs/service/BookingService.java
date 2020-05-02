package com.frs.service;

import java.util.List;

import com.frs.dto.Booking;
public interface BookingService {
	
	public Booking addBooking(Booking booking);
	public List<Booking> viewBooking();
}
