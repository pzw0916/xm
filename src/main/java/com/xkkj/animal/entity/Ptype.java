package com.xkkj.animal.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@Table(name="ptype")
public class Ptype {
    @Id
    private int ptid;
    private String ptypename;
}
