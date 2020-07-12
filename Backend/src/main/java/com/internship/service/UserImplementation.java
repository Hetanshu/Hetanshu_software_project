package com.internship.service;

import com.internship.entity.User;
import com.internship.exception.BadRequestException;
import com.internship.repository.IUserRepository;
import com.internship.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements IUser {

    @Autowired
    IUserRepository usRepo;

    @Override
    @Transactional (readOnly = true)
    public List<User> GetAllUser() {
        return (List<User>) usRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User FindUser(int userId) {
        // optional is a wrapper on top of vehicle object
        Optional<User> v1 = usRepo.findById(userId);
        if(!v1.isPresent ())
        {
            throw new UserNotFoundException ("User with id :" + userId +" not found");
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
    public User Create(User objUser) {
        User v1 = usRepo.save ( objUser );
        if(v1 == null)
        {
            throw new BadRequestException ("User  not created successfully:" + objUser.getUserId () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public User update(int userid, User objUser) {
        Optional<User> v1 = usRepo.findById(userid);
        if(!v1.isPresent ())
        {
            throw new UserNotFoundException ("User with id :" + userid +" not found");
        }
        return   usRepo.save( objUser);
        //  return  null;
    }

    @Override
    @Transactional
    public void Delete(int userId) {
        Optional<User> v1 = usRepo.findById(userId);
        if(!v1.isPresent ())
        {
            throw new UserNotFoundException ("User with id :" + userId +" not found");
        }
        usRepo.delete ( v1.get () );
    }
}