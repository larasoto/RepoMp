package com.lara.Mperformance.repositories;

import com.lara.Mperformance.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
