package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;

    @NotEmpty(message = "vui Long nhap e mail")
    @Column(name = "name")
    private String name ;

    @NotEmpty(message = "Vui Long Nhap pass word")
    @Column(name = "password")
    private String password ;

    @NotEmpty
    @Column(name="mail")
    private String email ;

    public Customer() {
    }

    public Customer( String name , String password ,String email){
        this.name = name ;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
