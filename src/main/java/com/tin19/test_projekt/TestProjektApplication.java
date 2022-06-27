package com.tin19.test_projekt;

import com.tin19.test_projekt.model.Drucker;
import com.tin19.test_projekt.model.Person;
import com.tin19.test_projekt.repository.DruckerRepository;
import com.tin19.test_projekt.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TestProjektApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext=
    SpringApplication.run(TestProjektApplication.class, args);

        PersonRepository personRepository=
        configurableApplicationContext.getBean(PersonRepository.class);

        DruckerRepository druckerRepository=
                configurableApplicationContext.getBean(DruckerRepository.class);


    }

}
