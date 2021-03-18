package com.lambda.zoo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animals")
public class Animal extends Auditable {
    @Id
    @GeneratedValue
    private long animalid;

    private String animaltype;

    @OneToMany(mappedBy = "animalid",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ZooAnimal> zoos = new ArrayList<>();

}
