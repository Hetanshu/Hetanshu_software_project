package com.internship.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class RegionName {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String regionId;
    private String regionName;

    public RegionName() { this.regionId = UUID.randomUUID().toString(); }


    public String getRegionId() { return regionId; }

    public void setRegionId(String regionId) { this.regionId = regionId; }


    public String getRegionName() { return regionName; }

    public void setRegionName(String regionName) { this.regionName = regionName; }

    @Override
    public String toString() {
        return "RegionName{" +
                "RegionId='" + regionId+ '\'' +
                ",RegionName='" + regionName + '\'' + '}';
    }
}

