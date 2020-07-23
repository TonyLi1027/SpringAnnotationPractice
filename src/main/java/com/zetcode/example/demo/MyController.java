package com.zetcode.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller


public class MyController {

    @Autowired
    private com.zetcode.example.demo.ICityService cityService;

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/cities")
    public ModelAndView showCities(){
        List<com.zetcode.example.demo.City> cities = cityService.findAll();
        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("ShowCities", params);

    }
}
