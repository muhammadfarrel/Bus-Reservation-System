package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
