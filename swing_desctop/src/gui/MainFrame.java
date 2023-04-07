package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title){
        super(title);

        final MainPannel mainPanel = new MainPannel();

        setLayout(new BorderLayout());
        add(new Toolbar(mainPanel), BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
