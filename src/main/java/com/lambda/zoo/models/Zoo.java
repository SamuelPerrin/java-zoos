package com.lambda.zoo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Zoo extends Auditable{
    @Id
    @GeneratedValue
    private long zooid;

    
}
