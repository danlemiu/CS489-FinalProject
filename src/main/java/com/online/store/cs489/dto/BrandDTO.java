package com.online.store.cs489.dto;

import com.online.store.cs489.domain.Brand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrandDTO {
    private Integer id;

    private String name;

    private String description;

    public BrandDTO(Brand brand){
        this.id = brand.getId();
        this.name = brand.getName();
        this.description = brand.getDescription();
    }
}
