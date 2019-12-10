package com.company;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.logging.Logger;

public class Duck implements Comparable<Duck>{
    private String name;
    private String type;
    private int weightInGrams;
    private int ageInMonths;

    public Duck(String name, String type, int weightInGrams, int ageInMonths) {
        this.name = name;
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.ageInMonths = ageInMonths;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    //Sorts my ducks by their name
    @Override
    public int compareTo(Duck duck) {
        Duck duckObject = duck;

        if (this.name.compareTo(duckObject.name) > 0) {
            return 1;
        } else if (this.name.compareTo(duckObject.name) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void logDuckToConsole(Duck duck) {
        System.out.println("\nThis duck's name is " + duck.getName() + " and it is " + duck.getAgeInMonths() + " months old. It weighs " + duck.getWeightInGrams() + " grams and is of type " + duck.getType() + ".");
    }


    public static void main(String[] args) {
        Duck quack = new Duck("Sir Quackalot", "Mallard", 100, 17);
        Duck nuack = new Duck("Sir Nuackalot", "Mallard", 200, 28);
        Duck buack = new Duck("Sir Buackalot", "Mallard", 270, 33);
        Duck puack = new Duck("Sir Puackalot", "Mallard", 30, 4);

        //Using Duck as key in map
        TreeMap<Duck, Integer> allTheDucks = new TreeMap<>();

        //Treemap sorts my ducks into order automatically because I'm implementing Comparable and wrote my compareTo method
        allTheDucks.put(quack, quack.ageInMonths);
        allTheDucks.put(nuack, nuack.ageInMonths);
        allTheDucks.put(buack, buack.ageInMonths);
        allTheDucks.put(puack, puack.ageInMonths);

        //Prints the Map (in it's right order)
        System.out.println("Printed map:\n" + allTheDucks.entrySet());

        //Logs any duck you choose and tells some useful info about it
        logDuckToConsole(quack);

    }
}
//=============================Exercise Instructions============================
//    Your goal is to add sufficient functionality to the Duck class to support:
//
//        1. Using the Duck as the key in a Map
//        2. Sorting a list of Ducks into order
//        3. Printing something useful when logging a Duck to the console.
//
//    Record any interesting design decisions you need to make during this exercise.
//==============================================================================