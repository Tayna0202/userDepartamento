package com.user.userdepartamento.repositories;

import com.user.userdepartamento.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
