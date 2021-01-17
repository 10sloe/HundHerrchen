/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        
       //Objekte erzeugen
        Herrchen herrchen = new Herrchen("Max");       
        Hund rex = new Hund("Rex");
        Hund waldi = new Hund("Waldi");

        //Beziehungen zwischen den Objekten herstellen
        herrchen.setHund1(rex);       
        herrchen.setHund2(waldi);

        // Start des Programms
        System.out.println("Alle Hunde sollen bellen");
        herrchen.alleHundeBellen();
    }
}