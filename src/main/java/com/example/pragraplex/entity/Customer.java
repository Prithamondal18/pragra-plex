package com.example.pragraplex.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data

public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Integer id;
    private String firstName;
    private  String lastName;
    @Column(unique = true,nullable = false) //columnDefinition = "VARCHAR2 (255)"  ??
    private String email;

    private  String phone;

    @Column(unique = true)
    private String login;
    private  String passWord;
    @Transient                          //not a jpa column , sql will ignore it as a column
    private  boolean isLoggedIn;

    private Date createDate;

    private  Date updateDate;


}
