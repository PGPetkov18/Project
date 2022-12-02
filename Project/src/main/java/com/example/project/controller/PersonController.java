package com.example.project.controller;

import com.example.project.Service.PersonService;
import com.example.project.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



import java.util.Optional;

@Controller
@RequestMapping("/person")
public class PersonController {
@Autowired
    PersonService personService;
@GetMapping
public String getPersonPage(Model model){

    model.addAttribute("persons", personService.findAll());
    model.addAttribute("person", new Person());
    return "person";
}
@PostMapping
    public String addPerson(@ModelAttribute Person person){

    personService.save(person);
    return "redirect:/person";
}

@GetMapping("del")
    public String delPerson(@RequestParam int id){
    personService.delete(personService.findById(id));
    return "redirect:/person";
}

}
