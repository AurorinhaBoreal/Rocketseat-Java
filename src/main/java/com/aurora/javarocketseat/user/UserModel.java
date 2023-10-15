package com.aurora.javarocketseat.user;

import org.hibernate.annotations.CreationTimestamp;

import java.util.UUID;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Automatically configure the getters and setters to all the attributes of the class
// @Getter Automatically configure all the getters to all the attributes of the class
// @Setter Automatically configure all the setters to all the attributes of the class

// Creating a users table through H2
@Entity(name ="tb_users")
public class UserModel {
    
    @Id // Identifiyng it as a primary key
    @GeneratedValue(generator = "UUID") // Automatically generating it
    private UUID id;

    @Column(unique = true) // Contraint username to a unique attribute
    private String username;
    private String name;
    private String password;

    // Setter - When we need to search any information that has changed inside an attribute, update the attribute
    // Getter - When we want to get the value of a determinated attribute
    // Utilizing the Lombok lib, it'a possible to put a getter/setter in an unique attribute, just put the component right above it

    @CreationTimestamp // States the creation time of the user
    private LocalDateTime createdAt;

    
}
