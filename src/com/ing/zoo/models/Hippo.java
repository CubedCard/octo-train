package com.ing.zoo.models;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name) {
        super(name,"splash", "munch munch lovely");
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }
}
