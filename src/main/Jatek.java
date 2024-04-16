package main;

import java.util.Random;

public class Jatek {

    public Jatek(){
        start();
    }
    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között");  
        Random rnd = new Random();
        int kiirandoSzam = rnd.nextInt(10);
        System.out.println("A kitalálandó szám: " + kiirandoSzam);
    }
}
