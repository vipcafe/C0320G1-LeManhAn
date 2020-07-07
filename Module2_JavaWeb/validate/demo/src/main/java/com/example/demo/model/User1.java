package com.example.demo.model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User1 {

    @NotEmpty(message = "Vui lòng nhập tên :")
    @Size(min = 2, max = 30)
    private String name;


    @NotNull(message = "vui lòng nhập lại tuổi")
    @Min(18)
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
