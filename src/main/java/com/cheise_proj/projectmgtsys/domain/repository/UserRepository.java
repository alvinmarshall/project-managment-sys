package com.cheise_proj.projectmgtsys.domain.repository;

import com.cheise_proj.projectmgtsys.domain.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long> {
}
