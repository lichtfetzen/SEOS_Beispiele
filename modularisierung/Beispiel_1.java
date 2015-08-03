/*
    Aus dem Hauptprogramm soll ein ein Upro gruss aufgerufen werden
 */

package modularisierung;


/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_1
{

    public static void main(String[] args)              // Hauptprogramm
    {
        System.out.println("Vor Aufruf des Upro");
        gruss();                                        // Aufruf des Unterprogramms
        System.out.println("Nach Aufruf des Upro");
    }
    
    public static void gruss()                          // Unterprogramm
    {
        System.out.println("\t1. Anweisung im Upro");
        System.out.println("\t\tBye, bye real life");
        System.out.println("\tLetzte Anweisung im Upro");
    }

}

