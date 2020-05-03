package com.frs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.frs.dao.ScheduleFlightDao;
import com.frs.dao.ScheduleFlightDaoImpl;
import com.frs.dto.Airport;
import com.frs.dto.ScheduleFlight;



public class ScheduleFlightServiceImpl implements ScheduleFlightService {
	
	ScheduleFlightDao scheduleFlightDao=new ScheduleFlightDaoImpl();

	@Override
	public List<ScheduleFlight> viewScheduleFlights(Airport source, Airport destination, LocalDateTime flightDate) {
		
		List<ScheduleFlight> scheduleFlightList=scheduleFlightDao.viewScheduleFlight();
		List<ScheduleFlight> extractedFlightList=new ArrayList<ScheduleFlight>();
		for(ScheduleFlight scheduleFlight: scheduleFlightList) {
			if(scheduleFlight.getSchedule().getSourceAirport().equals(source) 
					&& scheduleFlight.getSchedule().getDestinationAirport().equals(destination)
					&& scheduleFlight.getSchedule().getDepartureDateTime().toLocalDate().equals(flightDate)) {
				extractedFlightList.add(scheduleFlight);
			}
		}
		return extractedFlightList;
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	