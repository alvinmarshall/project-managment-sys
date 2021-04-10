package com.cheise_proj.projectmgtsys.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;


@Entity(name = "user_account")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserAccount extends BaseModel {
    private String username;
    private String password;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("is_project_manager")
    private Boolean isProjectManager;
}
