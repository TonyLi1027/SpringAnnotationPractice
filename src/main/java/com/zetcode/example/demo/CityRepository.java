package com.zetcode.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<com.zetcode.example.demo.City, Long> {
}
