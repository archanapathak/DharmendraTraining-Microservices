package com.example.lombokEx;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
public String firstName;
public  String lastName;
}
