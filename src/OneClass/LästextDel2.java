package OneClass;
// Steg 1: Skriv ett program som läser in text ifrån
// kommando-raden rad för rad tills användaren
// skriver ordet stop.
// ---------------------------------------------------------
// Steg 2: När användaren är klar skriver programmet ut antal
// tecken och hur många rader som användaren har skrivit,
// exklusive raden med ordet stop

import java.util.Scanner;
public class LästextDel2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean inputtext = true;
        int lines = 0;
        int totalsymbols = 0;

        String text = "";
        System.out.println("Enter a word or type 'stop' to exit: ");
        while (inputtext){

        text = scan.nextLine();
        if (text.equalsIgnoreCase("stop")){
            System.out.println("User has typed STOP to finish the program!!");
            inputtext = false;
        }else {
            lines ++;
            totalsymbols += text.length();
        }
        } // while (inputtext)
        System.out.println("Total Number of symbols used were: " + totalsymbols);
        System.out.println("Total number of lines except Stop line, used were: " + lines);
    } // psvm main
} // class Lästext