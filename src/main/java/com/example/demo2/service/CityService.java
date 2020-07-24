package com.example.demo2.service;

import com.example.demo2.model.City;
import com.example.demo2.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {

        return (List<City>) cityRepository.findAll();
    }
}
