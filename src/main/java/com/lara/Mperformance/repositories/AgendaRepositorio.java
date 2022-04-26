package com.lara.Mperformance.repositories;

import com.lara.Mperformance.models.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AgendaRepositorio extends JpaRepository<Agenda, Long> {
}
