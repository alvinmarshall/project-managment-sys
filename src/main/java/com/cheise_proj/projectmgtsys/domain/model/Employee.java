package com.cheise_proj.projectmgtsys.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Employee extends BaseModel {
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @Column(unique = true)
    private String code;
    private String name;
    @OneToOne
    @JoinColumn(name = "user_account_id",referencedColumnName = "id")
    private UserAccount userAccount;
}
