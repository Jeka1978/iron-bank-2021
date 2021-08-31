package com.game_of_thrones.ironbank2021.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.game_of_thrones.ironbank2021.model.Person;
import com.game_of_thrones.ironbank2021.services.IronBankService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Evgeny Borisov
 */

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private IronBankService bankService;


    @PostMapping("/save")
    public Person person(@RequestBody Person person) {
        System.out.println(person+" was saved");
        return person.withBalance(person.getBalance() + 100).withName(person.getName().toUpperCase());
    }




/*
    @GetMapping("/all")
    public void all(HttpServletRequest request) {
        System.out.println(request); RestTemplate
    }*/


    @GetMapping("/hi")
    public String hello2(@RequestParam String name) {
        return name.toLowerCase()+" и тебе не хворать";
    }

    @GetMapping("/name/{name}")
    public String hello(@PathVariable String name) {
        return name.toUpperCase();
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }


    @SneakyThrows
    public static void main(String[] args) {
      /*  ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Aragorn\"}";
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);

        person.setBalance(1000);
        String s = mapper.writeValueAsString(person);
        System.out.println("s = " + s);
*/


        RestTemplate restTemplate = new RestTemplate();

        Person person = restTemplate
                .postForObject("mathem/api/get/10", new Person(), Person.class);
        Integer answer = restTemplate.getForObject("url", int.class);
        System.out.println(12);
    }



}


