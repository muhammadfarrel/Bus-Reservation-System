package com.starterkit.springboot.brs.repository.bus;

import com.starterkit.springboot.brs.model.bus.Agency;
import com.starterkit.springboot.brs.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface AgencyRepository extends CrudRepository<Agency, Long> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
