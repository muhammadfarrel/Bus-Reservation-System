package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.History;
import com.starterkit.springboot.brs.model.bus.History;
import com.starterkit.springboot.brs.model.bus.Stop;

import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<History, Long>{
	History findByPassenger(String code);
}

