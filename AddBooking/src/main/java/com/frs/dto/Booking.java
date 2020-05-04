package com.frs.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Booking {
	
	@Id
	@Column
	private int bookingId;
	
	
	@Column
	User userID = new User();
	@Column
	private LocalDateTime bookingDate;
	
	@Column
	private List<Passenger> passengerList;
	@Column
	private Double ticketCost;
	
	@Column
	ScheduleFlight flight = new ScheduleFlight();
	@Column
	private Integer noOfPassengers;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(UUID bookingId, User userID, LocalDateTime bookingDate, List<Passenger> passengerList,
			Double ticketCost, ScheduleFlight flight, Integer noOfPassengers) {
		super();
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public User getUserID() {
		return userID;
	}
	public void setUserID(User userID) {
		this.userID = userID;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public ScheduleFlight getFlight() {
		return flight;
	}
	public void setFlight(ScheduleFlight flight) {
		this.flight = flight;
	}
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userID=" + userID + ", bookingDate=" + bookingDate
				+ ", passengerList=" + passengerList + ", ticketCost=" + ticketCost + ", flight=" + flight
				+ ", noOfPassengers=" + noOfPassengers + "]";
	}
}