package main;

import java.util.Random;

public class KitalalosJatek extends Jatek{

    public KitalalosJatek(){
        //start();
    }
    @Override
    void start() {
        System.out.println("Gondoltam egy számra, 0 és 9 között");  
        Random rnd = new Random();
        int kitalalandoSzam = rnd.nextInt(10);
        boolean nincsNyertes = true;
        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        Jatekos jatekos3 = new Jatekos();
        
        while(nincsNyertes == true){
            System.out.println("A kitalálandó szám: " + kitalalandoSzam);

            jatekos1.tippel();
            jatekos2.tippel();
            jatekos3.tippel();

            System.out.println("1 játékos tippje: " + jatekos1.tipp);
            System.out.println("2 játékos tippje: " + jatekos2.tipp);
            System.out.println("3 játékos tippje: " + jatekos3.tipp);
            nincsNyertes = jatekos1.tipp != kitalalandoSzam && jatekos2.tipp != kitalalandoSzam && jatekos3.tipp != kitalalandoSzam;
            if(nincsNyertes){
                System.out.println("a játékosok újra próbálkoznak!");
            }else{
                System.out.println("Van nyertes!");
                System.out.println("1 játékos tippje: " + jatekos1.tipp);
                System.out.println("2 játékos tippje: " + jatekos2.tipp);
                System.out.println("3 játékos tippje: " + jatekos3.tipp);
            }
        }
    }
}
