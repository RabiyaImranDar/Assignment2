package Assignment2fortsattning1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//<<<<<<<<<<<<<<<< TEST CLASS >>>>>>>>>>>>>>>>>>><
public class TestClass {

    @Test
    public void testAllLines(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        int expected = 2;

        linesAlphabets.setText("Alina");
        linesAlphabets.setText("Sameeha");
        linesAlphabets.setText("Stop");

        int actual = linesAlphabets.getLines();

        assertEquals(expected, actual);
    }
    @Test
    public void testAllSigns(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        int expected = 7;

        linesAlphabets.setText("Zain");
        linesAlphabets.setText("Eve");
        linesAlphabets.setText("Stop");

        int actual = linesAlphabets.getalphabets();

        assertEquals(expected, actual);
    }
    @Test
    public void testLongestWord(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        String expected = "JohnnyDepp";

        linesAlphabets.setText("Adam");
        linesAlphabets.setText("Eve");
        linesAlphabets.setText("JohnnyDepp");
        linesAlphabets.setText("Momo");
        linesAlphabets.setText("Stop");

        String actual = linesAlphabets.getLongestWord();

        assertEquals(expected, actual);
    }
@Test
    public void testCountWords(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        int expected = 4;

        linesAlphabets.setText("Alina");
        linesAlphabets.setText("Bob");
        linesAlphabets.setText("Sussi");
        linesAlphabets.setText("Ariana");
        linesAlphabets.setText("Stop");

        int actual = linesAlphabets.getNumWords();

        assertEquals(expected, actual);
    }

     @Test
    public void testNumSpecialChar(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        int expected = 5;

        //ACT
        linesAlphabets.setText("Pencils=3");
        linesAlphabets.setText("Rubbers=7");
        linesAlphabets.setText("&Sharpners");
        linesAlphabets.setText("*Rulers*");
        linesAlphabets.setText("sToP");
        int actual = linesAlphabets.getNumSpecChar();

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testNumDigits(){
        //Arrange
        LinesAlphabets linesAlphabets = new LinesAlphabets();
        int expected = 3;

        //ACT
        linesAlphabets.setText("Pencils=3");
        linesAlphabets.setText("Rubbers=7");
        linesAlphabets.setText("&Sharpners=9");
        linesAlphabets.setText("*Rulers*");
        linesAlphabets.setText("sToP");
        int actual = linesAlphabets.getNumDigits();

        //Assert
        assertEquals(expected, actual);
    }

}




