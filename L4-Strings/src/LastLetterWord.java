import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    /*
    The plan:
        1. Get input - three words
        2. Isolate the last three letter of any word
        3. combine the las three of three words
        4. output

     */

    public static void main(String[] args) {
String word1 = JOptionPane.showInputDialog("Enter word 1");
String word2 = JOptionPane.showInputDialog("Enter word 2");
String word3 = JOptionPane.showInputDialog("Enter word 3");
JOptionPane.showMessageDialog(null, lastThree(word1) + lastThree(word2) + lastThree(word3));

System.exit(0);
    }

    public static String lastThree(String word){
        return word.substring(word.length()-3);

    }
}
