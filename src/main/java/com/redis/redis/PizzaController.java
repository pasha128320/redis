package com.redis.redis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("")
    public Iterable<Pizza> getAllPositions(){
        return pizzaService.findAllPizza();
    }

    @PostMapping("/add")
    public void addNewPosition(@RequestBody Pizza pizza){
        pizzaService.savePizza(pizza);
    }

//    @GetMapping("/{id}")
//    public Optional<Pizza> getPizzaById(@PathVariable String id){
//        return pizzaService.getPizzaById(id);
//    }

    @GetMapping("/{user}")
    public Optional<Pizza> getPurchaseBagByUser(@PathVariable(name="user") String user){
        return pizzaService.findByUsername(user);
    }

    @PostMapping("/change")
    public void AddPositionInBag(@PathVariable(name="username") String username){
        Pizza user = pizzaService.getPizzaById(username).get();

    }


}
