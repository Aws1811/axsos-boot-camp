package com.axsos.burgertruker.services;

import com.axsos.burgertruker.models.Burger;
import com.axsos.burgertruker.repositires.BurgerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BurgerServices {
    private final BurgerRepo burgerRepo;

    public BurgerServices(BurgerRepo burgerRepo){
        this.burgerRepo=burgerRepo;
    }

    public List<Burger> allBurgers(){
        return burgerRepo.findAll();
    }

    public Burger createBurger(Burger burger){
        return burgerRepo.save(burger);
    }

    public Burger findBurger(Long id){
        Optional<Burger> optionalBurger = burgerRepo.findById(id);
        if(optionalBurger.isPresent()){
            return optionalBurger.get();
        }else {
            return null;
        }
    }
    public Burger updateBurger(Long id ,String burgerName,String resturantName,int rating,String note){
        Burger burger = findBurger(id);
        burger.setBurgerName(burgerName);
        burger.setResturantName(resturantName);
        burger.setRating(rating);
        burger.setNote(note);
        return burgerRepo.save(burger);
    }

    public void deleteBurger(Long id){
        burgerRepo.deleteById(id);
    }

}
