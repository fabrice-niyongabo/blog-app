package com.fabrice.blogapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) //specifying the status code for this exception
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;

    public ResourceNotFoundException(String resourceName) {
        super(String.format("%s not found.",resourceName)); //=> post not found
        // super(message) =>  this passed the message to the parent class which is RuntimeException (the one that is being extended with)
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }
}
