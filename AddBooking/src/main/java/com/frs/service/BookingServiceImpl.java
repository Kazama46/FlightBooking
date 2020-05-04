package com.frs.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.frs.dto.Booking;
import com.frs.repository.BookingRepository;

public class BookingServiceImpl implements BookingService 
{
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.save(booking);
		
	}
	

}