package com.hugesalt.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //using box types because hybernate like it so that they can be null
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
