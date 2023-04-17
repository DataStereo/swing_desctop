package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JToolBar {
    private ColorChangeListener colorChanger;



    public Toolbar(){
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorChanger.changeColor(Color.RED);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorChanger.changeColor(Color.BLUE);
            }
        });

        add(redButton);
        add(blueButton);
    }

    public void setColorChanger(ColorChangeListener colorChanger) {
        this.colorChanger = colorChanger;
    }
}
