import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI() {
        //CREATE THE GUI
        frame = new JFrame("Art Work");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel {

        public MyDrawing(){
            //Set the background color
            setBackground(Color.CYAN);
        }



        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(java.awt.Color.green);
            g.fillRect(0, 500, 700, 100);

            g.setColor(Color.YELLOW);
            g.fillRect(140, 200, 300, 300);

            g.setColor(Color.red);
            g.fillRect(110, 100, 360, 100);


        }
    }
}
