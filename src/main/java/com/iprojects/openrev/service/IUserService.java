package com.iprojects.openrev.service;

import com.iprojects.openrev.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    public User saveUser(User user);
}
