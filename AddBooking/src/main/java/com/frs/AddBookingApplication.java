package com.frs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.frs.service.BookingService;
import com.frs.service.BookingServiceImpl;

@SpringBootApplication
public class AddBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddBookingApplication.class, args);
		
	}
	
	@Bean
	public BookingService getBookingServiceImpl()
	{
		return new BookingServiceImpl();
	}
	
	/*
	@Bean
	public User getUser()
	{
		return new User();
	}
	@Bean
	public Passenger getPassenger()
	{
		return new Passenger();
	}
	*/

	
	

}
