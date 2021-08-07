package com.sistema.projecto.boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.projecto.boot.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
User findByUsername(String username);
}
