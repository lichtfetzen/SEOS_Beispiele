/*
        Aufruf eines Unterprogramms mit Parameter
 */

package modularisierung;

// Scanner für Tastatureingaben importierren
import java.util.Scanner;

/**
 *
 * @author w4s1m0t0
 */

public class Beispiel_2
{

    public static void main(String[] args)
    {

        // Scanner erzeugen
        Scanner sc = new Scanner(System.in);
        
        // Variablendeklaration
        String name;
        
        // Eingabeaufforderung
        System.out.print("Dein Name lautet: ");
        
        // Eingabe
        name = sc.nextLine();
        
        // Upro-Aufrufe
        gruss(name);                    // mit Variable
        gruss("Erich");                 // mit Konstante
        gruss(name + " Friedrich");     // mit Ausdruck
        
    }
    
    public static void gruss(String werIstEs)
    {
        System.out.println("\tHallo " + werIstEs + ", sei gegruesst!");
    }

}

