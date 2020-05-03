package com.frs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.frs.dto.Airport;
import com.frs.dto.ScheduleFlight;


public interface ScheduleFlightService {
	public List<ScheduleFlight> viewScheduleFlights(Airport source, Airport destination, LocalDateTime flightDate);

	
}
