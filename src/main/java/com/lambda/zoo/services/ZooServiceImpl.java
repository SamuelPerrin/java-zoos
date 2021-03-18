package com.lambda.zoo.services;

import com.lambda.zoo.models.Zoo;
import com.lambda.zoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {
    @Autowired
    private ZooRepository zoorepos;

    @Override
    public List<Zoo> getAllZoos() {
        List<Zoo> zoos = new ArrayList<>();
        zoorepos.findAll()
                .iterator()
                .forEachRemaining(zoos::add);
        return zoos;
    }

    @Override
    public Zoo getZooById(long id) throws EntityNotFoundException {
        return zoorepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " not found!"));
    }
}
