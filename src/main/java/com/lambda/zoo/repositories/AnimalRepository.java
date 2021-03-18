package com.lambda.zoo.repositories;

import com.lambda.zoo.models.Animal;
import com.lambda.zoo.views.ZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query(value = "SELECT a.animaltype, count(zooid) as countzoos FROM animals a LEFT JOIN zooanimals z ON a.animalid = z.animalid GROUP BY z.zooid",
            nativeQuery = true)
    List<ZooCount> getZooCounts();
}
