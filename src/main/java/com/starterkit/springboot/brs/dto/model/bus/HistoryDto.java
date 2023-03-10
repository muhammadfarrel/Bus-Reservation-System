package com.starterkit.springboot.brs.dto.model.bus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class HistoryDto implements Comparable{
	
	private Long id;
	
	private String journeyDate;
	
	private String passenger;

    private String passengerMobileNumber;
    
    private String sourceStop;

    private String destinationStop;

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getJourneyDate().compareTo(((HistoryDto) o).getJourneyDate());
	}
	
}
