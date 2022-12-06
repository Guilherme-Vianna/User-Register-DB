package Controller;
import View.Connect_GUI;

import javax.swing.*;
import java.net.ConnectException;

public class Main {
    public static void main(String args[]){
        JFrame _j = new Connect_GUI("Teste");
        _j.setVisible(true);
    }
}
