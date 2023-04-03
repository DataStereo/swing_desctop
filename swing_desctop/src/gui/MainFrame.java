package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(String title){
        super(title);

        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        add(panel, BorderLayout.CENTER);


        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
