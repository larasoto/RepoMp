package com.lara.Mperformance.Dto;

import com.lara.Mperformance.models.Service;

public class ServiceDTO {
    private long id;

    private String name;
    private Double price;
    private String image;

    public ServiceDTO() {
    }

    public ServiceDTO(Service service) {
        this.id = service.getId();
        this.name = service.getName();
        this.price = service.getPrice();
        this.image = service.getImage();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
