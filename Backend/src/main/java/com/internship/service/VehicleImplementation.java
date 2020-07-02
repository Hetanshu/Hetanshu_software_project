package com.internship.service;

import com.springrest.entity.Vehicle;
import com.springrest.exception.BadRequestException;
import com.springrest.exception.VehicleNotFoundException;
import com.springrest.respository.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleImplementation implements IVehicle {

    @Autowired
    IVehicleRepository vehiRepo;

    @Override
    @Transactional (readOnly = true)
    public List<Vehicle> GetAllVehicle() {
        return (List<Vehicle>) vehiRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehicle FindVehicle(String strVehicleNum) {
       // optional is a wrapper on top of vehicle object
        Optional<Vehicle> v1 = vehiRepo.findById(strVehicleNum);
        if(!v1.isPresent ())
        {
            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleNum +" not found");
        }
        return v1.get();
       // return  null;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Vehicle FindVehicleName(String strVehicleName) {
//        //optional is a wrapper on top of vehicle object
//        Optional<Vehicle> v1 = vehiRepo.findByStrmake(strVehicleName);
//        if(!v1.isPresent ())
//        {
//            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleName +" not found");
//        }
//        return v1.get();
//    }


    @Override
    @Transactional
    public Vehicle Create(Vehicle objVehicle) {
        Vehicle v1 = vehiRepo.save ( objVehicle );
        if(v1 == null)
        {
            throw new BadRequestException ("Vehicle  not created successfully:" + objVehicle.getMake () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public Vehicle update(String strVehicleNumber, Vehicle objVehicle) {
       Optional<Vehicle> v1 = vehiRepo.findById(strVehicleNumber);
        if(!v1.isPresent ())
        {
            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleNumber +" not found");
        }
        return   vehiRepo.save( objVehicle);
      //  return  null;
    }

    @Override
    @Transactional
    public void Delete(String strVehicleNum) {
        Optional<Vehicle> v1 = vehiRepo.findById(strVehicleNum);
        if(!v1.isPresent ())
        {
            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleNum +" not found");
        }
       vehiRepo.delete ( v1.get () );
    }
}
