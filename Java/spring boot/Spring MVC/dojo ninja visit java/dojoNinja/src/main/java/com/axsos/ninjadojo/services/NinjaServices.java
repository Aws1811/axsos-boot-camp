package com.axsos.ninjadojo.services;

import com.axsos.ninjadojo.models.Dojo;
import com.axsos.ninjadojo.models.Ninja;
import com.axsos.ninjadojo.repositires.DojoRepo;
import com.axsos.ninjadojo.repositires.NinjaRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
public class NinjaServices {


        public final NinjaRepo ninjaRepo;

        public NinjaServices(NinjaRepo ninjaRepo) {
            this.ninjaRepo = ninjaRepo;

        }

        public List<Ninja> FindAllNinjas(){
            return ninjaRepo.findAll();
        }

        public void createNinja(Ninja ninja){
            ninjaRepo.save(ninja);
        }
        public Ninja findNinja(Long ninjaId){
            Optional<Ninja> optionalNinja = ninjaRepo.findById(ninjaId);
            if(optionalNinja.isPresent()){
                return optionalNinja.get();

            }
            else {
                return null;

            }


        }



    }


