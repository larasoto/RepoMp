package com.lara.Mperformance.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String hours;
    private LocalDate date;
    private Tipo tipo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="service_id")
    private Service  service;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="client_id")
    private Client client;

    public Turn() {
    }

    public Turn(long id, String hours, LocalDate date, Service service, Client client, Tipo tipo) {
        this.id = id;
        this.hours = hours;
        this.date = date;
        this.service = service;
        this.client =client;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
