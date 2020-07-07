package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "nameProvince")
    private String nameProvince;

    @Column(name = "is_delete")
    private boolean isDelete;

    @OneToMany(mappedBy = "province")
    private Set<Customer> customers;


    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Province(int id, String nameProvince , boolean isDelete) {
        this.id = id;
        this.nameProvince = nameProvince;
        this.isDelete = isDelete ;
    }

    public Province() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }
}
