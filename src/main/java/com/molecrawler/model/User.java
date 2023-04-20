package com.molecrawler.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "TB_USERS")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 5230109053574079107L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}
