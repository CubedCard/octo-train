package com.ing.zoo.models;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class Animal {
    public String name;
    public String helloText;
    public String eatText;

    public Animal(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
    }

    public void sayHello() {
        System.out.println(this.helloText);
    }
}
