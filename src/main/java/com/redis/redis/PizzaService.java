package com.redis.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PizzaService {
    private PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void savePizza(Pizza pizza){
        pizzaRepository.save(pizza);
    }

    public Optional<Pizza> getPizzaById(String id){
        return pizzaRepository.findById(id);
    }

    public Iterable<Pizza> findAllPizza(){
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> findByUsername(String user){
        return pizzaRepository.findById(user);
    }

}
