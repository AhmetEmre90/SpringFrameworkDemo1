package com.ahmetemre90.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {

    private String test;

    public JsfBean() {
        this.test = "test123, hello world";
    }
}
