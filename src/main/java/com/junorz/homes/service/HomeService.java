package com.junorz.homes.service;

import com.junorz.homes.domain.Building;
import com.junorz.homes.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HomeService {

    private final HomeRepository homeRepository;

    @Autowired
    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Transactional
    public List<Building> findAll() {
        List<Building> buildingList = new ArrayList<>();
        homeRepository.findAll()
                .iterator()
                .forEachRemaining(buildingList::add);
        return buildingList;
    }

    @Transactional
    public Building findById(String id) {
        Optional<Building> buildingOptional = homeRepository.findById(Long.parseLong(id));
        return buildingOptional.orElse(null);
    }

}
