package com.zetcode.example.demo;

import com.zetcode.example.demo.City;
import com.zetcode.example.demo.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements com.zetcode.example.demo.ICityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll(){
        return (List<City>) cityRepository.findAll();
    }
}
