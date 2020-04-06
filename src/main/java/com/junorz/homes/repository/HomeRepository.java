package com.junorz.homes.repository;

import com.junorz.homes.domain.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends CrudRepository<Building, Long> {
}
