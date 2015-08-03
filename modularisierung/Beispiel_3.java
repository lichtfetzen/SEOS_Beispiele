/*
    
 */

package modularisierung;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_3
{

    public static void main(String[] args)
    {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        int zahl1;
        int zahl2;
        
        // Eingabeaufforderung
        System.out.print("Erste Zahl eingeben: ");
        zahl1 = sc.nextInt();
        System.out.print("Zweite Zahl eingeben: ");
        zahl2 = sc.nextInt();
        
        // Aufruf Methode 'minimumAusgeben'
        minimumAusgeben( zahl1 , zahl2 );
        
    }
    
    
    
    public static void minimumAusgeben(int wert1, int wert2)
    {
        
        /* Variante #1
        if (wert1 < wert2)
        {
            System.out.println(wert1 + " ist der kleinere Wert");
        }
        else
        {
            System.out.println(wert2 + " ist der kleinere Wert");
        }
                */
        
        /* Variante #2
        System.out.println((wert1 < wert2 ? wert1 : wert2) + " ist der kleinere Wert");
                */
        
        // Variante #3
        int treffer;
        treffer = wert1 < wert2 ? wert1 : wert2;
        System.out.println( treffer + " ist der kleinere Wert.");

        
    }

}

