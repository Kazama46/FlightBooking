package com.frs.dao;

import java.time.LocalDateTime;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.frs.dto.Booking;
import com.frs.dto.User;

public class BookingDaoImpl implements BookingDao {
	
	@Override
	public Booking addBooking(Booking booking) {
		
		booking.setBookingDate(LocalDateTime.now());
		booking.setNoOfPassengers(1);
		booking.setTicketCost(8787.343);
	
		UUID bookingId = UUID.randomUUID();
		booking.setBookingId(bookingId);
		return booking;
		
/*		for(int i=0; i<booking.getNoOfPassengers; i++)
		{
			booking.getPassengerList().get(i).getPassengerName();
			booking.getPassengerList().get(i).getPassengerAge();
			booking.getPassengerList().get(i).getLuggage();
			booking.getPassengerList().get(i).getPassengerUIN();
			booking.getPassengerList().get(i).getPnrNumber();
		}
		return booking;*/
		
	}

	@Override
	public List<Booking> showBooking() {
		// TODO Auto-generated method stub
		return null;
	}

}
