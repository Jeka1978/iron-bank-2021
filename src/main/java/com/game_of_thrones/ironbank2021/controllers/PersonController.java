package com.game_of_thrones.ironbank2021.controllers;

import com.game_of_thrones.ironbank2021.model.Person;
import com.game_of_thrones.ironbank2021.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public String savePerson(@RequestBody Person person) {
        personService.savePerson(person);
        return "saved";
    }

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        List<Person> list = personService.getAllPersons();
        return list;
    }
}






