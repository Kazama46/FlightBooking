package com.frs.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.frs.dao.BookingDao;
import com.frs.dao.BookingDaoImpl;
import com.frs.dto.Booking;


public class BookingServiceImpl implements BookingService
{
	BookingDao bookingDao=new BookingDaoImpl();
	
	@Override
	public Booking addBooking(Booking booking) 
	{
		return bookingDao.addBooking(booking);
	}

	@Override
	public List<Booking> viewBooking()
	{
		return bookingDao.showBooking();
	}
}
