package com.internship.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends RuntimeException{

    public ResourseNotFoundException(String strMessage){ super(strMessage);}
}