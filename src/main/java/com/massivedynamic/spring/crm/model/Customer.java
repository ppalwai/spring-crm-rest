package com.massivedynamic.spring.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.StringJoiner;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }
}