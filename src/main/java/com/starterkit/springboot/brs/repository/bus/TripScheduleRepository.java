package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Trip;
import com.starterkit.springboot.brs.model.bus.TripSchedule;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface TripScheduleRepository extends CrudRepository<TripSchedule, Long> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}