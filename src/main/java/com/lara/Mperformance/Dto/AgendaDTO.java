package com.lara.Mperformance.Dto;

import com.lara.Mperformance.models.Agenda;
import com.lara.Mperformance.models.Service;

import java.util.Date;

public class AgendaDTO {
    private long id;
    private Date turnosDisp;
    private Service service;

    public AgendaDTO() {
    }

    public AgendaDTO(Agenda agenda) {
        this.id = agenda.getId();
        this.turnosDisp =agenda.getTurnosDisp();
        this.service =agenda.getService();
    }

    public long getId() {
        return id;
    }

    public Date getTurnosDisp() {
        return turnosDisp;
    }

    public void setTurnosDisp(Date turnosDisp) {
        this.turnosDisp = turnosDisp;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
