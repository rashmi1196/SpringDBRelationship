package com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.repository;


import com.spring.database.relationship.SpringDBRelationship.oneToManyBidirectional.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
}


// Web Layer
// RestController => View => HTTP Methods => @Autowired Service => Method Implementations
// whenever a request shows up

// Business Layer
// Service Layer => DAO Layer=> @Autowired Repository as Dependency Injection => Method Implementations on Sevice

// DAO Layer [Database Communication]
// 1. Entity => Hibernate Trying to create tables, alter tables
// 2. Repository => JPA Repository => CRUD Operations

