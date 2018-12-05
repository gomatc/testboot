package com.knightech.saic.repository;

import org.springframework.data.repository.CrudRepository;

import com.knightech.saic.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}