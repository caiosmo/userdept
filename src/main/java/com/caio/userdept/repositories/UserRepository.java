package com.caio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
