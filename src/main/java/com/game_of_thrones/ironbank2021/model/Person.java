package com.game_of_thrones.ironbank2021.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
//@NamedQuery(name = "getAllpersons",query = "from person p where p.balance>:balance")
public class Person {

   /* @OneToMany(cascade = CascadeType.ALL)
    private List<Event> events;
*/

    @Id
    @GeneratedValue
    private int id;
    private String name;


    //    @Column(name = "TOTAL_BALANCE")
    private int balance;


    public Person(String name) {
        this.name = name;
    }


}
