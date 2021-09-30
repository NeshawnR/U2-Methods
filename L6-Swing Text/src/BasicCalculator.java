import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JLabel number1;
    static JLabel number2;
    static JTextField textField1;
    static JTextField textField2;
    static JLabel resultsLable;

    public static void main(String[] args) {

        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        number1 = new JLabel("Enter a number");
        textField1 = new JTextField(10);
        number2 = new JLabel("Enter a number");
        textField2 = new JTextField(10);
        JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");
        JButton multiple = new JButton("Multiple");
        JButton divide = new JButton("Divide");

        resultsLable = new JLabel("0.00");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        add.addActionListener(new addListener());
        add.addActionListener(new addListener2());
        add.addActionListener(new addListener3());
        add.addActionListener(new addListener4());

        panel.add(number1);
        panel.add(textField1);
        panel.add(number2);
        panel.add(textField2);

        panel.add(resultsLable);

        panel.add(add);
        panel.add(subtract);
        panel.add(multiple);
        panel.add(divide);
        window.add(panel);

        window.setVisible(true);
    }

    private static class addListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            resultsLable.setText(String.valueOf(number1 + number2));
        }
    }

    private static class addListener2 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            resultsLable.setText(String.valueOf(number1 - number2));
        }
    }

    private static class addListener3 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            resultsLable.setText(String.valueOf(number1 * number2));
        }
    }
    private static class addListener4 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(textField1.getText());
            double number2 = Double.parseDouble(textField2.getText());

            resultsLable.setText(String.valueOf(number1 / number2));
        }
    }
}
