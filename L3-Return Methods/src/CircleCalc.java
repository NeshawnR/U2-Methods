import javax.swing.*;
import java.text.DecimalFormat;
/*
1. Get the input - radius
2. Calculate area
3. calculate circumference
4. Display results - output
*/
    public class CircleCalc {


    public static void main(String[] args) {
    double radius = getInput("What is the radius?");

    double area = area(radius);

    double circumference = circumference(radius);

    JOptionPane.showMessageDialog(null, displayResult(area, circumference));
        //create and run the program

    }
    public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }
    public static double area(double radius){

        return Math.pow(radius, 2) * Math.PI;
    }
    //re-write the method to calculate a circle's area using parameters and return statement

    public static double circumference(double radius){

        return 2 * Math.PI * radius;
}
    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static String displayResult(double area, double circumference) {

        DecimalFormat round = new DecimalFormat("#.00");

        String message = "The area is: " + round.format(area);
        message += "\nThe circumference is: " + round.format(circumference);

        JOptionPane.showMessageDialog(null, message);
        return message;
    }
}
