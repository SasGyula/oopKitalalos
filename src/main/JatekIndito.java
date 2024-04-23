package main;
public class JatekIndito {
    public static void main(String[] args) {
        /*referencia nélkül példányosítjuk az objektumot és hívjuk egy metódusát*/
        //new Jatek().start();
        
        //referencián keresztül hívjuk az objektum metódusát
        //Jatek referencia = new Jatek();
        //referencia.start();
        
        //referencia nékül csak a konstruktort hivjuk azaz példányosítjuk
        //egységbezárás
        //new Jatek();
        
//        3 játékos 1-1 tippel
//        
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        
//öröklődés és polimorfózis
        //new CsigaversenyJatek().indit();
        //CsigaversenyJatek verseny = new CsigaversenyJatek();
        //verseny.indit();
        
        //polimorfizmus: bal oldalt állhat az ős
        Jatek kitalalos = new KitalalosJatek();
        Jatek verseny = new CsigaversenyJatek();
        
        Jatek[] jatekok = {kitalalos, verseny, new Jatek()};
        for(Jatek jatek : jatekok){
//            //ezt akkor tehetük meg ha a játék igazi típusa kitalálós játék
//            //((KitalalosJatek)jatek).start();
//            //Hibás tervezés eredménye: nincs közös metódus
//            if(jatek instanceof KitalalosJatek){
//                //a dupla zárójellel kasztoltuk a jatek-ot Kitalalosjatekra
//                ((KitalalosJatek)jatek).start();
//            }else if(jatek instanceof CsigaversenyJatek){
//                ((CsigaversenyJatek)jatek).indit();
//            }    
            //jatek.kezdes();
            jatek.start();
        }
    }
    
}
