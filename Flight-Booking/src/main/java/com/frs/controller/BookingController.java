package com.frs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frs.dto.Booking;
import com.frs.dto.Passenger;
import com.frs.dto.Schedule;
import com.frs.dto.ScheduleFlight;
import com.frs.service.BookingService;
import com.frs.service.BookingServiceImpl;
import com.frs.service.ScheduleFlightService;
import com.frs.service.ScheduleFlightServiceImpl;

@RestController()
@RequestMapping("/booking")
public class BookingController {
	
	BookingServiceImpl bookingService = new BookingServiceImpl();
	Booking booking  = new Booking();
	
	
	Schedule schedule = new Schedule();
	ScheduleFlightServiceImpl scheduleflightService = new ScheduleFlightServiceImpl();
	
	@RequestMapping("/addbooking")
	public Booking booking()
	{
		bookingService.addBooking(booking);
		return booking;
	}
	
	@RequestMapping("/available")
	public List<ScheduleFlight> available()
	{
		List<ScheduleFlight> extractedFlightList=new ArrayList<ScheduleFlight>();
		extractedFlightList = scheduleflightService.viewScheduleFlights(schedule.getSourceAirport() , schedule.getDestinationAirport(), schedule.getDepartureDateTime());
		return extractedFlightList;
		
		
	}
}
