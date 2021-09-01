package com.game_of_thrones.ironbank2021.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


//@Entity
public class Event {
    @Id
    @GeneratedValue
    private int id;

    private String title;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
