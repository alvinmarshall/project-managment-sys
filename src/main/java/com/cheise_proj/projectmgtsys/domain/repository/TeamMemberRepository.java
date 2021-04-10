package com.cheise_proj.projectmgtsys.domain.repository;

import com.cheise_proj.projectmgtsys.domain.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMember,Long> {
}
