package com.tin19.test_projekt.controller;

import com.tin19.test_projekt.model.Drucker;
import com.tin19.test_projekt.service.DruckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DruckerController {

    @Autowired
    public DruckerService druckerService;

    @PostMapping("/addDrucker")
    public Drucker addDrucker(@RequestBody Drucker drucker) {
        return druckerService.saveDrucker(drucker);
    }

    @PostMapping("/addAllDrucker")
    public List<Drucker> addAllDrucker(@RequestBody List<Drucker> druckers) {
        return druckerService.save_mehrere_Drucker(druckers);
    }

    @GetMapping("/findAllDrucker")
    public List<Drucker> findAllPerson() {
        return druckerService.getAllDrucker();
    }


    @GetMapping("/findDrucker/{d_id}")      //Dies bei Postman eingeben.
    public Drucker findDruckerById(@PathVariable long d_id){
        return druckerService.getDruckerById(d_id);
    }

    @PutMapping("/updateDrucker")        // id = d_id
    public Drucker updatePerson(@RequestBody Drucker drucker) {
        return druckerService.updateDrucker(drucker);
    }

    @PutMapping("/deleteDrucker/{d_id}")
public String deleteDrucker(@PathVariable  long d_id){
        return druckerService.delete(d_id);
}

}

