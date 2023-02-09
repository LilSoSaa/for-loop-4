package it.develhope.forloop;

import java.util.Random;

public class CustomNumber {
     int number;

    public CustomNumber() {
        Random rand = new Random();
        this.number = rand.nextInt(12) ;
        System.out.println("Generate a random number: " + number);

    }

    public void getMultiplicationTable() {
        for (int i = 12; i >= 1; i--) {
            System.out.println(number + " x " + i + "= " + number * i);
        }

    }
}