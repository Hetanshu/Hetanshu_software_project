package com.internship.exception;

import com.internship.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {


    public UserNotFoundException(String strMessage)
    {
        super(strMessage);
    }
}