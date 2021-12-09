package kg.itacademy.fv21.modfinal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(drawer);
        jFrame.setVisible(true);
    }
}
