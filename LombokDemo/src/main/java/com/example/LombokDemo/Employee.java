package com.example.LombokDemo;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private @Setter @Getter Integer employeeId;
    private @Setter @Getter String name;
    private @Setter @Getter String company;
    private @Setter @Getter String emailId;
}
