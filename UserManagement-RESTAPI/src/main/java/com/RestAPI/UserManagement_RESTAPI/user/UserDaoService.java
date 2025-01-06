package com.RestAPI.UserManagement_RESTAPI.user;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserDaoService {

    public static int usercount = 5;
    public static List<User> users = new ArrayList<User>();

    static {

//        users.add(new User(1, "John", new Date()));
//        users.add(new User(2, "Robert", new Date()));
//        users.add(new User(3, "Adam", new Date()));
//        users.add(new User(4, "Andrew", new Date()));
//        users.add(new User(5, "Jack", new Date()));

        users.add(new User(1, "John"));
        users.add(new User(2, "Robert"));
        users.add(new User(3, "Adam"));
        users.add(new User(4, "Andrew"));
        users.add(new User(5, "Jack"));

    }

    public List<User> findALl() {
        return users;
    }


    //add more user to list

    public User save(User user) {
    if(user.getId()==null){
        user.setId(++usercount);
    }
    users.add(user);
    return user;
    }

    public User finOne(int id) {
        for(User user:users){
            if(user.getId()==id)
                return user;
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> usersiterator = users.iterator();

        while (usersiterator.hasNext()){
            User user = usersiterator.next();
            if(user.getId()==id){
                usersiterator.remove();
                return user;
            }

        }
        return null;
    }
}