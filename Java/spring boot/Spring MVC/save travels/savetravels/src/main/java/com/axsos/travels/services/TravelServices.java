package com.axsos.travels.services;

import com.axsos.travels.models.Travel;
import com.axsos.travels.repositires.TravelRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelServices {
    private final TravelRepo travelRepo;
    public TravelServices(TravelRepo travelRepo){
        this.travelRepo=travelRepo;
    }
    public List<Travel> allTravels(){
        return travelRepo.findAll();
    }
    public void createTravel(Travel travel){
        travelRepo.save(travel);
    }
    public Travel findTravel(Long id){
        Optional<Travel> optionalTravel = travelRepo.findById(id);
        if(optionalTravel.isPresent()){
            return optionalTravel.get();
        }else{
        return null;
        }
    }
    public void updateTravel(Long id ,String expense,String vendor,Integer amount,String desc){
        Travel travel = findTravel(id);
        travel.setAmount(amount);
        travel.setDesc(desc);
        travel.setExpense(expense);
        travel.setVendor(vendor);
        travelRepo.save(travel);
    }
    public void delete(Long id){
        travelRepo.deleteById(id);
    }

}
