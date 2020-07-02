package com.springrest.controller;

import com.springrest.entity.Vehicle;
import com.springrest.service.VehicleImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "vehicles")
public class VehicleController {

    @Autowired
    private VehicleImplementation vehicleService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> GetAllVehicle(){
        return vehicleService.GetAllVehicle ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle FindVehicle(@PathVariable("vin") String strVehicleNum)
    {
        return vehicleService.FindVehicle ( strVehicleNum );
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle Create(@RequestBody Vehicle objVehicle)
    {
        return vehicleService.Create ( objVehicle );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{vin}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle update(@PathVariable("vin") String strVehicleNumber,@RequestBody Vehicle objVehicle)
    {
        return vehicleService.update ( strVehicleNumber,objVehicle );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{vin}")
    public void Delete(@PathVariable("vin") String strVehicleNum)
    {
        vehicleService.Delete ( strVehicleNum );

    }



}
