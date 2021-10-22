import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window = new JFrame("Color Switcher");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme Dark");
    JButton buttonThemeLight = new JButton("Theme Light");
    JButton buttonThemeRegular = new JButton("Theme Regular");

     


    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI() {
        //create your GUI

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(buttonThemeDark);
        panel.add(buttonThemeLight);
        panel.add(buttonThemeRegular);

        buttonThemeDark.addActionListener(new ThemeDark());
        buttonThemeRegular.addActionListener(new ThemeRegular());
        buttonThemeLight.addActionListener(new ThemeLight());

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
private class ThemeDark implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){

            Color panelBack = new Color(0, 0, 0);
            Color buttonBack = new Color(0, 43, 255);
            Color buttonText = new Color(56, 0, 255);

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeRegular.setBackground(buttonBack);
            buttonThemeRegular.setBackground(buttonText);
            buttonThemeLight.setBackground(buttonBack);
            buttonThemeLight.setBackground(buttonText);
        }

    }
    private class ThemeRegular implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){

            Color panelBack = new Color(0, 79, 255);
            Color buttonBack = new Color(255, 0, 0);
            Color buttonText = new Color(120, 255, 0);

            panel.setBackground(panelBack);
            buttonThemeRegular.setBackground(buttonBack);
            buttonThemeRegular.setBackground(buttonText);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeLight.setBackground(buttonBack);
            buttonThemeLight.setBackground(buttonText);
        }

    }
    private class ThemeLight implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){

            Color panelBack = new Color(87, 173, 246);
            Color buttonBack = new Color(248, 77, 77);
            Color buttonText = new Color(252, 241, 68);

            panel.setBackground(panelBack);
            buttonThemeLight.setBackground(buttonBack);
            buttonThemeLight.setBackground(buttonText);
            buttonThemeRegular.setBackground(buttonBack);
            buttonThemeRegular.setBackground(buttonText);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
        }

    }

}
