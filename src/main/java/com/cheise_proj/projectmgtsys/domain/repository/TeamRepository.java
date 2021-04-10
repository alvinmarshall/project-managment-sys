package com.cheise_proj.projectmgtsys.domain.repository;

import com.cheise_proj.projectmgtsys.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
