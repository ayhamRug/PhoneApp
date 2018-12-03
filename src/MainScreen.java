import javax.swing.*;

public class MainScreen {

    private JPanel appView;
    private JLabel appTitle;
    private JTextField textFieldMax;
    private JTextField textFieldMin;
    private JLabel incomeTitle;
    private JLabel incomeMin;
    private JLabel incomeMax;
    private JButton submit;

    public static void main(String[] args) {

        //Initiating the panel
        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainScreen().appView);
        frame.pack();
        frame.setSize(1200,800);
        frame.setVisible(true);

    }


}


