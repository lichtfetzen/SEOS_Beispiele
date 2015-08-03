/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modularisierung;

// Scanner für Tastatureingaben importierren
//import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_4 {

    public static void main(String[] args) {

        // Scanner erzeugen
        //Scanner sc = new Scanner(System.in);
        
        // Array deklarieren und init
        int [] mainArray = {54, 84, 4, -58, 112};
        
        // Array ausgeben
        System.out.println("Array vor Aufruf des Upros: ");
        for ( int x : mainArray)
        {
            System.out.print(x + "\t");
        }
        System.out.println();
        
        // Methode 'minimumAusgeben' aufrufen
        minimumAusgeben( mainArray );
        
        // Array ausgeben
        System.out.println("Array nach Aufruf des Upros: ");
        for ( int x : mainArray)
        {
            System.out.print(x + "\t");
        }
        System.out.println();
    }
    
    // Methode 'minimumAusgeben'
    public static void minimumAusgeben( int [] uProgArray)
    {
        // Hilfsvariable deklarieren und init
        int minimum = uProgArray[0];
        
        // Durchlaufe alle Elemente des Arrays
        for ( int x : uProgArray)
        {
            minimum = x < minimum ? x : minimum;    // Prüfe ob Element kleiner 'minimum'
        }
        
        // Ausgabe des ermittelten Minimums
        System.out.println( minimum + " ist die kleinste Zahl");
        
        uProgArray = new int[10];
    }

}
