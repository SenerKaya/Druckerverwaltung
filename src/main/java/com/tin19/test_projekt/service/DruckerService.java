package com.tin19.test_projekt.service;


import com.tin19.test_projekt.model.Drucker;
import com.tin19.test_projekt.model.Drucker;
import com.tin19.test_projekt.repository.DruckerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DruckerService {
    private DruckerRepository druckerRepository;

    public Drucker saveDrucker(Drucker drucker){
        return druckerRepository.save(drucker);
    }


    public List<Drucker> save_mehrere_Drucker(List<Drucker> drucker) {
        return (List<Drucker>) druckerRepository.saveAll(drucker);
    }

    public List<Drucker> getAllDrucker() {
        return (List<Drucker>)druckerRepository.findAll();
    }

    public Drucker getDruckerById(Long d_id) {

        return  druckerRepository.findById(d_id).orElse(null);
    }

    public String delete(Long d_id) {
        druckerRepository.deleteById(d_id);
        return "Drucker removed !! " + d_id;
    }

    public Drucker updateDrucker(@RequestBody Drucker drucker) {
        Drucker existingDrucker = druckerRepository.findById(drucker.getD_id()).orElse(null);
        existingDrucker.setName(drucker.getDruckername());

        return druckerRepository.save(existingDrucker);
    }


}
