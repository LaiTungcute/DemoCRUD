package com.example.DemoPorject.CRUD.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id) {
        super("Not found " + id);
    }
}

