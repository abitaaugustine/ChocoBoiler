package com.example.chocoboiler;

public class Main {
    public static void main(String[] args) {
        ChocoBoiler chocoBoiler =  ChocoBoiler.getInstance();
        chocoBoiler.fill();
        chocoBoiler.boil();
        chocoBoiler.drain();
        System.out.println(chocoBoiler);

        System.out.println("\n\n");

        ChocoBoiler chocoBoiler1 = ChocoBoiler.getInstance();
        chocoBoiler1.fill();
        chocoBoiler1.boil();
        chocoBoiler1.drain();
        System.out.println(chocoBoiler1);


        System.out.println(chocoBoiler == chocoBoiler1);
    }
}
