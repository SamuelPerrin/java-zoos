package com.lambda.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable {
    @Id
    @GeneratedValue
    private long zooid;

    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ZooAnimal> animals = new ArrayList<>();

    @OneToMany(mappedBy = "zoo",  cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private List<Telephone> telephones = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(long zooid, String zooname, List<ZooAnimal> animals, List<Telephone> telephones) {
        this.zooid = zooid;
        this.zooname = zooname;
        this.animals = animals;
        this.telephones = telephones;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<ZooAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<ZooAnimal> animals) {
        this.animals = animals;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }
}
