package Assignment2fortsattning1;

// <<<<<<<<<<<<<<<<<<<<<<   LOGIC CLASS MED METHODER  >>>>>>>>>>>>>>>>>>>>>>
public class LinesAlphabets {   // attributes of class defined under
    private int lines;
    private int numAlphabets, numText;
    private String input;
    private String allText = ""; // for DEL2 och 3

    private String longWord;
    private int numChar, numDigits;

    public LinesAlphabets() {      // constructor can be written without any parameters!
    }

    public int getLines() {
        return lines;
    }

    public int getalphabets() {
        return numAlphabets;
    }

    public void setAlphabets(String aWord) {
        if (aWord.length() > 0) {
            numAlphabets += aWord.length();
        } else {
            System.out.println("No Text Entered therefore zero alphabets!!");
        }
    }

    public void setLines() {
        if (input != "") {
            lines++;
        }
    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<< Första del >>>>>>>>>>>>>>>>>>>>>>>>>>>
    public boolean setText(String inputText) {
        int countChar = 0, countDig = 0, numTex = 0;
        if (inputText.equalsIgnoreCase("stop")) {
            System.out.println("User has typed 'Stop' to terminate the program");
            return false;
        } else if (!inputText.equalsIgnoreCase("")) {
            input = inputText;
            allText = allText + inputText + " ";
            numTex++;
            char[] tempcharArray = input.toCharArray();// <-----------to count special chars
            for (int i = 0; i < tempcharArray.length; i++) {
                if (!Character.isLetterOrDigit(tempcharArray[i]) &&
                        (!Character.isWhitespace(tempcharArray[i]))) {
                    countChar++;
                } else if (Character.isDigit(tempcharArray[i])) {
                    countDig++;
                }
            }
            numChar += countChar;
            numDigits += countDig;
            numText += numTex;
            setAlphabets(input);
            setLines();

            return true;
        } else {
            System.out.println("Invalid word!");
            return true;
        }
    }

    public void printingAllText() {
        System.out.println(allText);
    }

    public String getLongestWord() {
        String longWord = "";
        String[] longest = allText.split(" ");
        for (int i = 0; i < longest.length; i++) {
            if (longWord.length() < longest[i].length()
                    && (!longest[i].equalsIgnoreCase("stop"))) {
                longWord = longest[i];
            }
        }
        this.longWord = longWord;
        return this.longWord;
    }

    public int getNumSpecChar() {
        return numChar;
    }

    public int getNumDigits() {
        return numDigits;
    }

    public int getNumWords() {
        return numText;
    }
}
