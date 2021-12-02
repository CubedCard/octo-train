package com.ing.zoo.models;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        super(name, "roooaoaaaaar", "nomnomnom thx mate");
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }
}
