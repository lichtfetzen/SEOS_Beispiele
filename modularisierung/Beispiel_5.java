/*
        Funktionsaufruf mit einer ABBRUCH SCHLEIFE
 */

package modularisierung;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_5 {

    public static void main(String[] args) {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablen deklarieren
        double eingabeWert;                 // Eingegebener Wert
        double ergebnis;                    // Variable für Rückgabewert
        
            while (true)                    // Alternativ auch möglich     'for (;;) {...}'
            {
                System.out.print("Beliebige Zahl (Ende mit 0): ");
                eingabeWert = sc.nextDouble();
                if (eingabeWert == 0) break;                // Abbruchbedingung mit break!!!
                ergebnis = absolutBetrag( eingabeWert );
                System.out.println("Absolutbetrag von " + eingabeWert + " ist: " + ergebnis);
            }        
    }
    
    // Funktion absolutBetrag
    
    /* mit Hilfvariable
    public static double absolutBetrag ( double z )
    {
        double rueck;
        rueck = z < 0 ? -z : z;
        return rueck;
    }
    */
    
    /* Kurzvariante ohne Hilfvariable
    public static double absolutBetrag ( double z )
    {
        return z < 0 ? -z : z;
    }
    */
    
    public static double absolutBetrag ( double z )
    {
        if (z < 0)
        {
            return -z;
        }
        return z;
        
    }
}

