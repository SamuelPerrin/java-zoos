package com.lambda.zoo.repositories;

import com.lambda.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
