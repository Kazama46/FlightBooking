package com.frs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frs.dto.Booking;
import com.frs.dto.Passenger;
import com.frs.service.BookingService;
import com.frs.service.BookingServiceImpl;

@RestController()
@RequestMapping("/booking")
public class BookingController {
	
	BookingServiceImpl bookingService = new BookingServiceImpl();
	Booking booking = new Booking();
	
	@RequestMapping("/addbooking")
	public Booking booking()
	{
		bookingService.addBooking(booking);
		return booking;
	}
	
}
