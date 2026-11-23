package com.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitness.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public boolean existsByEmail(String email);
}
