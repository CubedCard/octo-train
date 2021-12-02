package com.ing.zoo.models;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Circus {
    public String trick;

    public Tiger(String name) {
        super(name, "rraaarww", "nomnomnom oink wubalubadubdub");
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
