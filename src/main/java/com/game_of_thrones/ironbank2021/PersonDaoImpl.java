package com.game_of_thrones.ironbank2021;

import com.game_of_thrones.ironbank2021.model.Person;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    public List<Person> getAllPersons() {

//        entityManager.createNamedQuery("getAllPersons").setParameter("balance",10).getResultList()

        return entityManager
                .createQuery("from Person")

                .getResultList();
    }

    @SneakyThrows
    public <T> void дляНасти(Class<T> type) {

        ResultSet resultSet = null;

        List list = new ArrayList<>();


        while (resultSet.next()) {

            T t = type.getDeclaredConstructor().newInstance();
            Field[] fields = type.getDeclaredFields(); //todo filter all fields marked with @Transient
            for (Field field : fields) {
                Object fieldValue = resultSet.getObject(field.getName());
                field.setAccessible(true);
                field.set(t, fieldValue);
            }

            list.add(t);

        }


    }
}










