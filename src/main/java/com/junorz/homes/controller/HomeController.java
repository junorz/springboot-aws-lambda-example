package com.junorz.homes.controller;

import com.junorz.homes.domain.Building;
import com.junorz.homes.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/buildings")
    public List<Building> findAllBuildings() {
        return homeService.findAll();
    }

    @GetMapping("/building/{id}")
    public Building findBuildingById(@PathVariable String id) {
        return homeService.findById(id);
    }

}
