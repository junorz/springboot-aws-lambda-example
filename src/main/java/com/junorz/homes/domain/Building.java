package com.junorz.homes.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Building {

    @Id
    @GeneratedValue(generator = "buildingIdGen")
    @GenericGenerator(name = "buildingIdGen", strategy = "native")
    private long id;

    @Column
    private String name;

    @Column
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
