package com.example.demo2.contoller;

import com.example.demo2.service.ICityService;
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
    private ICityService cityService;

    @RequestMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/cities")
    public ModelAndView showCities() {

        List cities = cityService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("showCities", params);
    }
}
