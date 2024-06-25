package com.adrianoeduca.course.repositories;

import com.adrianoeduca.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
