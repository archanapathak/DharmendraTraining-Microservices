package com.RestAPI.UserManagement_RESTAPI.user;

import com.RestAPI.UserManagement_RESTAPI.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        User user = userDaoService.finOne(id);
        if (user == null)
            throw new UserNotFoundException("id = " + id);
        return user;
    }

//@PostMapping("/users")
//    public void createUser (@RequestBody User user){
//
//        User saveduser = userDaoService.save(user);
//    }

    @PostMapping("/createUser")
    public ResponseEntity<Object> createUser1 (@RequestBody @Valid User user){

        User saveduser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(saveduser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/users/{id}")
    public void  deleteUser(@PathVariable int id){
        User deleteduser = userDaoService.deleteById(id);
        if(deleteduser == null)
            throw new UserNotFoundException("id "+id);
    }
}
