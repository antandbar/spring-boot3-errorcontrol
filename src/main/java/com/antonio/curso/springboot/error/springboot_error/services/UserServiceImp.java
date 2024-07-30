package com.antonio.curso.springboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.curso.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private List<User> users;


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();

 /*        User user = null;
        for(User u: users) {
            if(u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        return Optional.ofNullable(user); */
    }

}