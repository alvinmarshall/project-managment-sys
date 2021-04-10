package com.cheise_proj.projectmgtsys.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Role extends BaseModel{
    private String name;
}
