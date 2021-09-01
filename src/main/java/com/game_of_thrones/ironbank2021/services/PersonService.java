package com.game_of_thrones.ironbank2021.services;

import com.game_of_thrones.ironbank2021.PersonDao;
import com.game_of_thrones.ironbank2021.RandomUtil;
import com.game_of_thrones.ironbank2021.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public void savePerson(Person person) {
        personDao.save(person);
    }

    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }

    @EventListener(ContextRefreshedEvent.class)
    public void saveManyPerson() {
        for (int i = 0; i < 10; i++) {

            Person person = Person.builder().balance(RandomUtil.between(10, 1000))
                    .name(RandomUtil.randomName())
                    .build();
            this.savePerson(person);
        }

    }
}





