import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args){

        JFrame window = new JFrame("Three Quotes");
        JPanel panel = new JPanel();
       JButton quote1 = new JButton("Click for First Quote");
       JButton quote2 = new JButton("Click for Second Quote");
       JButton quote3 = new JButton("Click for Third Quote");

       window.setSize(350, 100);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setLocationRelativeTo(null);

       quote1.addActionListener(new Quote1());
       quote2.addActionListener(new Quote2());
       quote3.addActionListener(new Quote3());

       panel.add(quote1);
       panel.add(quote2);
       panel.add(quote3);

       window.add(panel);
        window.setVisible(true);
    }

    private static class Quote1 implements ActionListener {

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "\"This is my favorite quote\"\n-Me");
        }
    }

    private static class Quote2 implements ActionListener {

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "\"This is also my favorite quote\"\n-Me");
        }
    }
    private static class Quote3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "\"This is not my favorite quote\"\n-Me");
        }
    }
}

