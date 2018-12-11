import GUI.MainScreen;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Creating & showing a main app window

        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainScreen().getAppView());

        frame.pack();
        frame.setSize(400,800);
        frame.setVisible(true);
    }
}
