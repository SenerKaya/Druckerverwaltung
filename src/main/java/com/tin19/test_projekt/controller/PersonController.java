package com.tin19.test_projekt.controller;

import com.tin19.test_projekt.model.Person;
import com.tin19.test_projekt.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    public PersonService personService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PostMapping("/addPersons")
    public List<Person> addPersons(@RequestBody List<Person> persons) {
        return personService.savePersons(persons);
    }

    @GetMapping("/findAllPerson")
    public List<Person> findAllPerson() {
        return personService.getAllPersons();
    }

    @GetMapping("/findPerson/{p_id}")      //Dies bei Postman eingeben.
    public Person findPersonById(@PathVariable long p_id){
        return personService.getPersonById(p_id);
    }

    @PutMapping("/updatePerson")        // id = p_id
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    @PutMapping("/deletePerson/{p_id}")
public String deletePerson(@PathVariable  long p_id){
        return personService.delete(p_id);
}

}

