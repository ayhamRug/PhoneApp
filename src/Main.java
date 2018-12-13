import BusinessLogic.Phones;
import GUI.MainWindow;

import javax.swing.*;

public class Main {

    // Creating & showing a main app window
    //
    public static void main(String[] args) {
        Phones.initData();

        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainWindow().getAppView());

        frame.pack();
        frame.setSize(400,800);
        frame.setVisible(true);
    }
}
