package com.iprojects.openrev.service;

import com.iprojects.openrev.entity.User;
import com.iprojects.openrev.repository.IUserRepository;
import exception.ApiException;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService{
    @Autowired
    public UserService(IUserRepository userRepo){

    }
    public User saveUser(User user) {
        if(true) throw new ApiException("error while creating");
        // check the email is unique
        // save new user
        // add role to the user
        //        send verifiation URL
        //        save url in versfication table
        //        send email to user with verification URL
        //        return the newly created userif any errors, throw exception with proper message
        return null;
    }
}
