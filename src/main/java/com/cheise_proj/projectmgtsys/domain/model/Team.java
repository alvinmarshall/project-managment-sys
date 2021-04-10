package com.cheise_proj.projectmgtsys.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Team extends BaseModel{
    private String name;
}
