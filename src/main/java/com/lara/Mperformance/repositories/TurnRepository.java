package com.lara.Mperformance.repositories;

import com.lara.Mperformance.models.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TurnRepository extends JpaRepository<Turn,Long > {

}
