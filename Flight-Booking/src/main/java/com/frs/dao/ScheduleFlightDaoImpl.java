package com.frs.dao;

import java.util.ArrayList;
import java.util.List;

import com.frs.dto.ScheduleFlight;

public class ScheduleFlightDaoImpl implements ScheduleFlightDao {

	@Override
	public List<ScheduleFlight> viewScheduleFlight() {
		List<ScheduleFlight> scheduleflightList = new ArrayList<ScheduleFlight>();
		ScheduleFlight scheduleflight = new ScheduleFlight();
		
		scheduleflight.setAvailableSeats(43);
		scheduleflightList.add(scheduleflight);
		return scheduleflightList;
	}
}
