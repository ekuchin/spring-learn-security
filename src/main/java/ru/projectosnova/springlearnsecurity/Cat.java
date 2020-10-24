package ru.projectosnova.springlearnsecurity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String breed;

    public Cat() {
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
