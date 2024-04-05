package com.redis.redis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza,String> {
    Optional<Pizza> findById(String user);
}
