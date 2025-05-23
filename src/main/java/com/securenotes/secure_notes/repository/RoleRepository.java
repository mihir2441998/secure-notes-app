package com.securenotes.secure_notes.repository;

import com.securenotes.secure_notes.Utils.enums.AppRole;
import com.securenotes.secure_notes.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(AppRole roleName);
}
