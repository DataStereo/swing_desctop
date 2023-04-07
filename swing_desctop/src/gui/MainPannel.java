package gui;

import javax.swing.*;
import java.awt.*;

public class MainPannel extends JPanel implements ColorChangeListener{
    public MainPannel(){
        setBackground(Color.GREEN);
    }
    public void changeColor(Color color){
        setBackground(color);
    }
}
