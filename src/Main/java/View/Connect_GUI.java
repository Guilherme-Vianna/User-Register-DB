package View;

import javax.swing.*;

public class Connect_GUI extends JFrame{
    private JButton button1;
    private JPanel mainPanel;
    public Connect_GUI(String Name){
        super(Name);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
}
