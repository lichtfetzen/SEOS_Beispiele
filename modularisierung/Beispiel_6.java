/*
        Funktion zur Ermittlung des Mittelwertes aller Array-Elemente
 */

package modularisierung;

/**
 * @author w4s1m0t0
 */

public class Beispiel_6 {
    
    /*
    main-Methode
    */
    public static void main(String[] args) {
        
        // Array deklarieren und init
        int [] mainArray = { 1, 2, 2};
        
        // Ausgabe des Rueckgabewertes der Methode avgArray
        System.out.println("Duchschnitt: " + avgArray(mainArray) );
        
    }
    
    /*
    Methode:            avgArray (Funktion)
    Parameter:          Array vom Typ int
    Rueckgabewert:      Mittelwert
    */
    public static int avgArray ( int [] funcArray )
    {
        long zwischenSumme = 0;                             // Hilfsvariablendeklaration
        double erg;
        
        for ( int  x : funcArray)                           // for-each-Schleife durchläuft alle Array-Elemente
        {
            zwischenSumme += x;                             // Summiert Werte aller Array-Elemente
        }
        
        erg = (double) zwischenSumme / funcArray.length + 0.5;      // +0.5 fuer kaufmaennisches Runden
        
        return (int) erg;                                   // Summe aller Array-Elemente durch Anzahl aller Elemente
    }
   
}