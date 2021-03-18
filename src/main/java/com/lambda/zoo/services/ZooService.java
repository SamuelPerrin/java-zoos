package com.lambda.zoo.services;

import com.lambda.zoo.models.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> getAllZoos();
    Zoo getZooById(long id);
}
