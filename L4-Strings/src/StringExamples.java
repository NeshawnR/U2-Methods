import java.sql.SQLOutput;
import java.util.Locale;

public class StringExamples {

    public static void main(String[] args){

        String greeting = "Hello";
        String name = "Hephaestus";

        //Style 1
        int greetingSize = greeting.length();
        System.out.println(greeting + " has " + greetingSize + " letters.");

        //Style 2
        System.out.println(name + "has " + name.length() + " letters.");

        //Creat a program which capitalizes the first letter of any word.

        /*
        1. Get the input - users name
        2.Isolate the first letter
        3. Capitalize the first letter
        4. Isolate everything after first letter
        5. combine step 2 and 4
        6. output
         */

        System.out.println(capitalizeFirst(name));

    }

    public static String capitalizeFirst(String name){

        String firstLetter = name.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();

        String restOfName = name.substring(1);

        return firstLetter + restOfName;

    }
}
