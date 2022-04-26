package com.lara.Mperformance.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String turnosDisp;
    private Service service;

    public Agenda() {
    }

    public Agenda( String turnosDisp, Service service) {
        this.id = id;
        this.turnosDisp = turnosDisp;
        this.service = service;
    }

    public long getId() {
        return id;
    }

    public String getTurnosDisp() {
        return turnosDisp;
    }

    public void setTurnosDisp(String turnosDisp) {
        this.turnosDisp = turnosDisp;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
