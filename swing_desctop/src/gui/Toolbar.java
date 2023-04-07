package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RedButtonListener implements ActionListener {
    private MainPannel mainPannel;

    public RedButtonListener(MainPannel mainPannel){
        this.mainPannel = mainPannel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainPannel.changeColor(Color.RED);
    }
}

class BlueButtonListener implements ActionListener {
    private MainPannel mainPannel;

    public  BlueButtonListener(MainPannel mainPannel){
        this.mainPannel = mainPannel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainPannel.changeColor(Color.BLUE);
    }
}

public class Toolbar extends JToolBar {
    public Toolbar(MainPannel mainPannel){
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");

        redButton.addActionListener(new RedButtonListener(mainPannel));
        blueButton.addActionListener(new BlueButtonListener(mainPannel));

        add(redButton);
        add(blueButton);
    }
}
