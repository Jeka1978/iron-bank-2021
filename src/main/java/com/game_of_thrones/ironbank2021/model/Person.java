package com.game_of_thrones.ironbank2021.model;

import lombok.*;

import java.beans.ConstructorProperties;
import java.beans.JavaBean;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@With
public class Person {
    private String name;
    private int balance;


}
