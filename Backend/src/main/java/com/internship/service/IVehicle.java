package com.springrest.service;

import com.springrest.entity.Vehicle;

import java.util.List;

public interface IVehicle {
    List<Vehicle> GetAllVehicle();
    Vehicle FindVehicle(String strVehicleNum);
    Vehicle Create(Vehicle objVehicle);
    Vehicle update(String strVehicleNumber, Vehicle objVehicle);
    void Delete(String strVehicleNum);
   // Vehicle FindVehicleName(String strVehicleName);

}
