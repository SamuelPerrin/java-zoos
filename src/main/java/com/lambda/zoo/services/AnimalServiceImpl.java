package com.lambda.zoo.services;

import com.lambda.zoo.repositories.AnimalRepository;
import com.lambda.zoo.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalrepos;

    @Override
    public List<ZooCount> getZooCounts() {
        List<ZooCount> list = animalrepos.getZooCounts();
        return list;
    }
}
