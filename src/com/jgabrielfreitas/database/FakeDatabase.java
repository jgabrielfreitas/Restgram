package com.jgabrielfreitas.database;

import com.jgabrielfreitas.model.Person;

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
public class FakeDatabase extends AbstractDatabase<Person> {

    private static FakeDatabase ourInstance = new FakeDatabase();

    public static FakeDatabase getInstance() {
        return ourInstance;
    }

    private FakeDatabase() {
    }

    public void insert(Person person) {
        add(person);
    }

}
