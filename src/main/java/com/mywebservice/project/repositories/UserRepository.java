package com.mywebservice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebservice.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
