package com.tin19.test_projekt.config;


import com.tin19.test_projekt.model.Drucker;
import com.tin19.test_projekt.model.Person;
import com.tin19.test_projekt.repository.DruckerRepository;
import com.tin19.test_projekt.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
/*
@Configuration
@Profile("dev")
@Transactional
public class DevConfiguration {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    DruckerRepository druckerRepository;

    @PostConstruct
    public void createData() {
        createPersonData();
        createDrucker();
    }


    private void createPersonData() {
Person person1 =new Person();
Person person2 =new Person();

person1.setFirstName("Sener");
person1.setLastName("Kaya");

person2.setFirstName("Azmi");
person2.setLastName("Kilic");

    }


    private void createDrucker() {
        Drucker drucker1 =new Drucker();
        Drucker drucker2 =new Drucker();

        drucker1.setName("Leitung");
        drucker2.setName("Mitarbeiter");

    }

}
*/