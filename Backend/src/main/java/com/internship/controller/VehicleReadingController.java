package com.springrest.controller;

import com.springrest.entity.VehicleReading;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "vehiclereading")
public class VehicleReadingController {

    @RequestMapping(method = RequestMethod.GET)
    public List<VehicleReading> GetAllVehicle(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}")
    public VehicleReading FindVehicle(@PathVariable("vin") String strVehicleNum)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public VehicleReading Create(@RequestBody VehicleReading objVehicle)
    {
        return null;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public VehicleReading update(@PathVariable("id") String strVehicleNumber, @RequestBody VehicleReading objVehicle)
    {
        return null;
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "{id}")
    public void Delete(@PathVariable("id") String strVehicleNum)
    {

    }

}
