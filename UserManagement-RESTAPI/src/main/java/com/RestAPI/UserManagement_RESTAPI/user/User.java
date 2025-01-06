package com.RestAPI.UserManagement_RESTAPI.user;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id ;
    @NotBlank(message = "name cannot be blank")
     @Size(min = 5 ,message = "length cannot be less than 5")
   // @ApiModelProperty(notes="name should have atleast 5 characters")
    String name ;
   // Date dob;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
              //  ", dob=" + dob +
                '}';
    }

    public User() {
    }
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    public User(Integer id, String name, Date dob) {
        this.id = id;
        this.name = name;
        //this.dob = dob;
    }
}
