package com.tin19.test_projekt.service;

import com.tin19.test_projekt.model.Person;
import com.tin19.test_projekt.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> savePersons(List<Person> persons) {
        return (List<Person>) personRepository.saveAll(persons);
    }

    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    public Person getPersonById(Long p_id) {

        return  personRepository.findById(p_id).orElse(null);
    }

    public String delete(Long p_id) {
        personRepository.deleteById(p_id);
        return "Person removed !! " + p_id;
    }

    public Person updatePerson(@RequestBody Person person) {
        Person existingPerson = personRepository.findById(person.getP_id()).orElse(null);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setDrucker(person.getDrucker());
        return personRepository.save(existingPerson);
    }

}
