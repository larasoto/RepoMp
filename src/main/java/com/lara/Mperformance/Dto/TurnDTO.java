package com.lara.Mperformance.Dto;

import com.lara.Mperformance.models.Service;
import com.lara.Mperformance.models.Tipo;
import com.lara.Mperformance.models.Turn;

import java.time.LocalDate;

public class TurnDTO {
    private long id;
    private String hours;
    private LocalDate date;
    private String tipo;
    private Service service;

    public TurnDTO() {
    }

    public TurnDTO(Turn turn) {
        this.id = turn.getId();
        this.hours = turn.getHours();
        this.date =turn.getDate();
        this.tipo = turn.getHours();
        this.service = turn.getService();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
