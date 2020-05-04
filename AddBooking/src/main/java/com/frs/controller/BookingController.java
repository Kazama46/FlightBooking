package com.frs.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frs.dto.Booking;
import com.frs.service.BookingService;
import com.frs.service.BookingServiceImpl;

@RestController

public class BookingController 
{
	@Autowired
	private BookingService bookingService;
	
	
	@PostMapping("/addbooking")
	public void addBooking()
	{
		bookingService.addBooking(new Booking());
		
		
	
		
	}
	
}



