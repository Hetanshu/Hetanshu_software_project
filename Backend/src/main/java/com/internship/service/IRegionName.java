package com.internship.service;
import com.internship.entity.RegionName;

import java.util.List;

public interface IRegionName {
    List<RegionName> GetAllRegionName();

    RegionName FindRegionName(int regionId);

    RegionName Create(RegionName objRegionName);

    RegionName update(int regionId, RegionName objRegionName);

    void Delete(int regionId);
}