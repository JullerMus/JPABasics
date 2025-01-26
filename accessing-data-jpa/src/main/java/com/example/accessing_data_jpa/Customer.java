package com.example.accessing_data_jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //indicates JPA Entity
public class Customer {


    @Id //Indicates the ID (primary key?) of the object for JPA
    @GeneratedValue(strategy = GenerationType.AUTO) //tells JPA to autogenerate ID
    private Long id;
    private String firstName;
    private String lastName;

    //This Customer constructor is protected, because it is only used by JPA
    protected Customer() {}

    //Constructor for instantiating Customers
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
