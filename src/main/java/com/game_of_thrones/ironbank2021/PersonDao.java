package com.game_of_thrones.ironbank2021;

import com.game_of_thrones.ironbank2021.model.Person;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface PersonDao {
    void delete(Person person);

    void save(Person person);

    List<Person> getAllPersons();
}
