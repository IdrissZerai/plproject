package com.plproject.plproject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "http://localhost:9091", maxAge = 3600)
@RestController
@RequestMapping("/")
public class Rediractor {

    @GetMapping("Home")
    public ModelAndView homeModel(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("Order")
    public ModelAndView orderView(ModelAndView modelAndView){
        modelAndView.setViewName("order");
        return modelAndView;
    }
}
