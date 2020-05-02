package com.frs.dao;

import java.util.List;

import com.frs.dto.Booking;

public interface BookingDao {
	public Booking addBooking(Booking booking);
	public List<Booking> showBooking();
}
