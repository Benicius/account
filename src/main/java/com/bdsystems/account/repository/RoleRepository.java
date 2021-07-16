package com.bdsystems.account.repository;

import com.bdsystems.account.domains.ERole;
import com.bdsystems.account.domains.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
