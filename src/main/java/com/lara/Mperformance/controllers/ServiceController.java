package com.lara.Mperformance.controllers;

import com.lara.Mperformance.Dto.ServiceDTO;
import com.lara.Mperformance.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @Autowired
    ServiceRepository serviceRepository;

    @RequestMapping("/services")
    public List<ServiceDTO> getService(){
        return serviceRepository.findAll().stream().map(service -> new ServiceDTO(service)).collect(Collectors.toList());
    }

}
