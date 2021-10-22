import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    static int clickerCount = 0;
    static JLabel clickerCountLabel;
    static JTextField textInputField;

    public static void main(String[] args) {

        JFrame window = new JFrame("CLICKER GAME");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        clickerCountLabel = new JLabel("Balance : $");
         JLabel textInputLabel = new JLabel("Enter a multiplier: ");
        JButton clicker = new JButton("Click for 1$");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new ClickerListener());

        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(clickerCountLabel);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);
    }

    private static class ClickerListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            int multiplier = Integer.parseInt(textInputField.getText());

            clickerCount += multiplier;
            clickerCountLabel.setText("Balance: $" + clickerCount);

        }
    }
}
