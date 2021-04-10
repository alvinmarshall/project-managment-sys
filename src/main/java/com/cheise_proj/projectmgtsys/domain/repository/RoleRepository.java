package com.cheise_proj.projectmgtsys.domain.repository;

import com.cheise_proj.projectmgtsys.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
