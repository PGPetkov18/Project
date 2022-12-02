package com.example.project.service;

import com.example.project.model.Person;
import com.example.project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }
public Person findById(int id){
        return personRepository.findById(id).orElse(new Person());
}
public Iterable<Person>findAll(){
        return personRepository.findAll();
}
    public Person save(Person person){
        return personRepository.save(person);
    }
    public void delete(Person person){
        personRepository.delete(person);
    }

}
