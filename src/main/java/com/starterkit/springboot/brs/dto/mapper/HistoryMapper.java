package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bus.HistoryDto;
import com.starterkit.springboot.brs.model.bus.History;

public class HistoryMapper {
	public static HistoryDto toHistoryDto(History history) {
		return new HistoryDto()
				.setId(history.getId())
				.setJourneyDate(history.getJourneyDate())
				.setPassenger(history.getPassenger().getFullName())
                .setPassengerMobileNumber(history.getPassenger().getMobileNumber())
                .setSourceStop(history.getTripSchedule().getTripDetail().getSourceStop().getName())
                .setDestinationStop(history.getTripSchedule().getTripDetail().getDestStop().getName());
                
	}

}
