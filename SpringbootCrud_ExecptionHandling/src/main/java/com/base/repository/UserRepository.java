package com.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
