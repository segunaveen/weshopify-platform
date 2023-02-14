package com.weshopify.platform.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weshopify.platform.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
