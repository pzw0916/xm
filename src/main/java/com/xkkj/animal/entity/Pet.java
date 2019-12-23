package com.xkkj.animal.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="pet")
public class Pet {
    @Id
    private int id;
    private String pname;

    @ManyToOne()
    @JoinColumn(name="ptypeid")
    private Ptype ptype;

    private Double pmoney;
    private String psex;
    private String page;
}
