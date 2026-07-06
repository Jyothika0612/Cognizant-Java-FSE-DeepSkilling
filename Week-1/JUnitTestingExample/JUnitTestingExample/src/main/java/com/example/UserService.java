package com.example;

public class UserService {

    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void saveUser() {

        logger.log("User Saved");

    }
}