package com.internship.controller;

import com.internship.entity.User;
import com.internship.service.UserImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserImplementation UserService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> GetAllUser(){
        return UserService.GetAllUser ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{userId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User FindUser(@PathVariable("userId") int userId)
    {
        return UserService.FindUser ( userId);
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User Create(@RequestBody User objUser)
    {
        return UserService.Create ( objUser );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{userId}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User update(@PathVariable("userId") int userId ,@RequestBody User objUser)
    {
        return UserService.update ( userId,objUser );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{userId}")
    public void Delete(@PathVariable("userId") int userId)
    {
        UserService.Delete ( userId );

    }



}
