package com.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
