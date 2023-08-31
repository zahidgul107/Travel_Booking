package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
