package com.online.store.cs489.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> products = new ArrayList<>();
}
