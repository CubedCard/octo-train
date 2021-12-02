package com.ing.zoo.models;

import java.util.Random;

public class Zebra extends Animal implements Herbivore, Circus {
    public String trick;

    public Zebra(String name) {
        super(name, "zebra zebra", "munch munch zank yee bra");
    }

    public void eatLeaves() {
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "black with white stripes, or white with black stripes?";
        } else {
            trick = "becomes a 'zebrapad'";
        }
        System.out.println(trick);
    }
}
