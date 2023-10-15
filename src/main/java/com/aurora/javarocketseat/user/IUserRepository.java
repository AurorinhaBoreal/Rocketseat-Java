package com.aurora.javarocketseat.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface it's like a contract with the application, it just defines what will be aplicated, but don't do nothing actively. Serve just as representation
// The extends allow to use all the JpaRepository functionalities through just calling IUserRepository
public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    
}
