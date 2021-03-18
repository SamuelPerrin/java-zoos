package com.lambda.zoo.models;

import javax.persistence.Id;

public class ZooAnimal {
    @Id
    private Animal animal;

    @Id
    private Zoo zoo;
}
