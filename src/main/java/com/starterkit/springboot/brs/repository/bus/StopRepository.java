package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Stop;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface StopRepository extends CrudRepository<Stop, Long> {
    Stop findByCode(String code);
}
