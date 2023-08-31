package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
