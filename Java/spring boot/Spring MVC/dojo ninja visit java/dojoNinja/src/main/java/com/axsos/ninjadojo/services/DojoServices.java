package com.axsos.ninjadojo.services;

import com.axsos.ninjadojo.models.Dojo;
import com.axsos.ninjadojo.repositires.DojoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoServices {
    public final DojoRepo dojoRepo;

    public DojoServices(DojoRepo dojoRepo) {
        this.dojoRepo=dojoRepo;

    }

    public List<Dojo> FindAllDojos(){
        return dojoRepo.findAll();
    }

    public void createDojo(Dojo dojo){
        dojoRepo.save(dojo);
    }
    public Dojo findDojos(Long dojoId){
        Optional<Dojo> optionalDojo = dojoRepo.findById(dojoId);
        if(optionalDojo.isPresent()){
            return optionalDojo.get();

        }
        else {
            return null;

        }


    }



}
