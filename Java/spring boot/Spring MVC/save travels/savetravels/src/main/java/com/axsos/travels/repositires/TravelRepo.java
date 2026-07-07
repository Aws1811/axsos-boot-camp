package com.axsos.travels.repositires;

import com.axsos.travels.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepo extends CrudRepository<Travel,Long> {
    List<Travel> findAll();
}
