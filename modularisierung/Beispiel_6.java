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

public class Beispiel_6 {

    public static void main(String[] args) {

        // Scanner erzeugen
        //Scanner sc = new Scanner(System.in);
        
        // Array deklarieren und init
        int [] mainArray = { 11 , 54 , 845, -574, 62};
        
        // Ausgabe mit Funktionsaufruf
        System.out.println("Duchschnitt: " + avgArray(mainArray) );
        
    }
    
    
    
    public static int avgArray ( int [] funcArray)
    {
        int zwischenSumme = 0;
        
        for ( int  x : funcArray)
        {
            zwischenSumme += x;
        }
        return zwischenSumme / funcArray.length;
    }

}

