package main;
public class JatekIndito {
    public static void main(String[] args) {
        /*referencia nélkül példányosítjuk az objektumot és hívjuk egy metódusát*/
        //new Jatek().start();
        
        //referencián keresztül hívjuk az objektum metódusát
        //Jatek referencia = new Jatek();
        //referencia.start();
        
        //referencia nékül csak a konstruktort hivjuk azaz példányosítjuk
        new Jatek();
        
        new Jatekos().tippel();
    }
    
}
