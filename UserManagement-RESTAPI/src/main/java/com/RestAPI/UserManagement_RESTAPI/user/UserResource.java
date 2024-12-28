package com.RestAPI.UserManagement_RESTAPI.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    UserDaoService userDaoService;
    @GetMapping("/users")
    public List<User> retriveAllUser(){
        return userDaoService.findALl();
    }
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return userDaoService.finOne(id);
    }
@PostMapping("/users")
    public void createUser (@RequestBody User user){

        User saveduser = userDaoService.save(user);
    }
}
