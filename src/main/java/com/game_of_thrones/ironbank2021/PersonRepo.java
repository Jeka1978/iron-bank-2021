package com.game_of_thrones.ironbank2021;

import com.game_of_thrones.ironbank2021.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface PersonRepo extends CrudRepository<Person, Integer> {
    List<Person> findByBalanceGreaterThan(int param);

}
