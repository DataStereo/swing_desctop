package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title){
        super(title);

        final MainPannel mainPanel = new MainPannel();
        final Toolbar toolbar = new Toolbar();

        toolbar.setColorChanger(mainPanel);

        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
