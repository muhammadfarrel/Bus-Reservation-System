package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Agency;
import com.starterkit.springboot.brs.model.bus.Bus;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface BusRepository extends CrudRepository<Bus, Long> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
