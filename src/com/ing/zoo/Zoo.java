package com.ing.zoo;

import com.ing.zoo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion("henk");
        animals.add(henk);
        Hippo elsa = new Hippo("elsa");
        animals.add(elsa);
        Pig dora = new Pig("dora");
        animals.add(dora);
        Tiger wally = new Tiger("wally");
        animals.add(wally);
        Zebra marty = new Zebra("marty");
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        boolean printed = false;
        for (Animal animal : animals) {
            if (input.contains("hello ")) {
                if (animal.name.equals(input.substring(input.indexOf(" ")).trim())) {
                    animal.sayHello();
                    printed = true;
                    break;
                }
            } else if (input.contains("hello")) {
                animal.sayHello();
                printed = true;
            } else if (input.equals("give meat") && animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
                printed = true;
            } else if (input.equals("give leaves") && animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
                printed = true;
            } else if (input.equals("perform trick") && animal instanceof Circus) {
                ((Circus) animal).performTrick();
                printed = true;
            }
        }
        if (!printed) System.out.println("Unknown command: " + input);
    }
}
