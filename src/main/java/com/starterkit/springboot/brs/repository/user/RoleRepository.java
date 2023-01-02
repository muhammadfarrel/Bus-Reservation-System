package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.Role;
import com.starterkit.springboot.brs.model.user.UserRoles;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kelompok 3 Kelompok 3.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}
