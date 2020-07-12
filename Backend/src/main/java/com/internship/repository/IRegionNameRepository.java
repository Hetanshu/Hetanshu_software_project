package com.internship.repository;

import com.internship.entity.RegionName;
import org.springframework.data.repository.CrudRepository;

public interface IRegionNameRepository extends CrudRepository<RegionName,Integer> {

    // Optional<User> findByRegionName(int regionId);

}