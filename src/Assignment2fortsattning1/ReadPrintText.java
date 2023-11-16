package Assignment2fortsattning1;

import java.util.Scanner;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  MAIN CLASS  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public class ReadPrintText {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalAlpha = 0;
        String text = "";
        int totalNumLines = 0;
        LinesAlphabets linesAlphabets = new LinesAlphabets(); // constructor is built with an object
        // without parameter /signature
        boolean inputText = true;

       System.out.println("Write a word Or type 'stop' to exit:  ");

        while (inputText) {
            text = scan.nextLine(); // get a word from console!
            inputText = linesAlphabets.setText(text);
            if (inputText == true) {

                System.out.println("Enter another word or type: Stop to exit!");
            }
        } //  while (inputtext)


        totalNumLines = linesAlphabets.getLines();
        System.out.println("Total number of lines except Stop line, used were: " + totalNumLines);
        totalAlpha = linesAlphabets.getalphabets();
        System.out.println("Total number of alphabets and/or signs used were : " + totalAlpha);
        //--------------------------------------------

        System.out.println("Printing all the entered words with space :" );
        linesAlphabets.printingAllText();
        System.out.println("Number of words entered were: " + linesAlphabets.getNumWords() );
        System.out.println("Printing the longest word: " + linesAlphabets.getLongestWord());
        System.out.println("Number of specialcharacters used were: " + linesAlphabets.getNumSpecChar());
        System.out.println("Number of digits used were: "+ linesAlphabets.getNumDigits());

    } // psvm main
} // class ReadPrintText
