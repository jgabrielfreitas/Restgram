package com.jgabrielfreitas.model;

import java.util.UUID;

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
public class Person {

    public String name;
    public String id = UUID.randomUUID().toString();

    public Person(String name) {
        this.name = name;
    }
}
