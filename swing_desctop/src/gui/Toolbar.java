package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorButtonListener implements ActionListener {
    private MainPannel mainPannel;
    private Color color;

    public ColorButtonListener(MainPannel mainPannel, Color color){
        this.mainPannel = mainPannel;
        this.color = color;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainPannel.changeColor(color);
    }
}

public class Toolbar extends JToolBar {
    public Toolbar(MainPannel mainPannel){
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        redButton.addActionListener(new ColorButtonListener(mainPannel, Color.RED));
        blueButton.addActionListener(new ColorButtonListener(mainPannel, Color.BLUE));

        add(redButton);
        add(blueButton);
    }
}
