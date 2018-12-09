import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class MainScreen {

    private JPanel appView;
    private JLabel appTitle;
    private JLabel incomeTitle;
    private JLabel incomeMin;
    private JLabel incomeMax;
    private JLabel warningAgeTxt;
    private JLabel warningMinTxt;
    private JLabel warningMaxTxt;
    private JTextField ageField;
    private JTextField textFieldMax;
    private JTextField textFieldMin;
    private JComboBox brand;
    private JRadioButton bigScreen5RadioButton;
    private JRadioButton smallScreen5RadioButton;
    private JCheckBox designCheckBox;
    private JCheckBox performanceCheckBox;
    private JCheckBox batteryLifeCheckBox;
    private JCheckBox cameraCheckBox;
    private JButton submit;

    public MainScreen() {

        ButtonGroup screenG = new ButtonGroup();
        screenG.add(bigScreen5RadioButton);
        screenG.add(smallScreen5RadioButton);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Check if a field is empty or filled wrong, or a radio button was not chosen
                if(ageField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "The age field is empty");
                }else{
                    if(isInteger(ageField.getText())){
                        if(textFieldMin.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "The Minimum price field is empty");
                        }else{
                            if(isInteger(textFieldMin.getText())){
                                if(textFieldMax.getText().equals("")){
                                    JOptionPane.showMessageDialog(null, "The Maximum price field is empty");
                                }else{
                                    if(isInteger(textFieldMax.getText())){

                                        if(Integer.parseInt(textFieldMin.getText()) > Integer.parseInt(textFieldMax.getText())){
                                            JOptionPane.showMessageDialog(null, "The Maximum price is less than the Minimum!");

                                        }else{
                                            if(bigScreen5RadioButton.isSelected() || smallScreen5RadioButton.isSelected()){

                                                //Getting all of the values from the starting interface to show them in a separate window for testing now.
                                                String rb;
                                                if(bigScreen5RadioButton.isSelected()){
                                                    rb = bigScreen5RadioButton.getText();
                                                }else{
                                                    rb = smallScreen5RadioButton.getText();
                                                }

                                                String x =  "Testing Window to check parameters \nAge: " + ageField.getText() +
                                                        "\nMin Price: " +
                                                        textFieldMin.getText() +
                                                        "\nMax Price: " +
                                                        textFieldMax.getText() +
                                                        "\nBrand: " +
                                                        brand.getSelectedItem().toString() +
                                                        "\nScreen: " +
                                                        rb+
                                                        "\nDesign: " +
                                                        designCheckBox.isSelected() +
                                                        "\nPerformance: " +
                                                        performanceCheckBox.isSelected() +
                                                        "\nBattery: " +
                                                        batteryLifeCheckBox.isSelected() +
                                                        "\nCamera: " +
                                                        cameraCheckBox.isSelected();
                                                JOptionPane.showMessageDialog(null, x);

                                                //Initialize variables to store important values so far
                                                int min = Integer.parseInt(textFieldMin.getText());
                                                int max = Integer.parseInt(textFieldMax.getText());
                                                ArrayList<String[]> arr;

                                                //Get the array following to the brand (just for the prototype) and show the results in the result class
                                                if(brand.getSelectedItem().toString().equals("Huawei")){

                                                    Huawei huawei = new Huawei();
                                                    arr = huawei.getArray();
                                                    new Result(arr,min,max);

                                                }else if(brand.getSelectedItem().toString().equals("LG")){

                                                    LG lg = new LG();
                                                    arr= lg.getArray();
                                                    new Result(arr,min,max);

                                                }else if(brand.getSelectedItem().toString().equals("Nokia")){

                                                    Nokia nokia = new Nokia();
                                                    arr= nokia.getArray();
                                                    new Result(arr,min,max);

                                                }else if(brand.getSelectedItem().toString().equals("Samsung")){

                                                    Samsung samsung = new Samsung();
                                                    arr= samsung.getArray();
                                                    new Result(arr,min,max);

                                                }else if(brand.getSelectedItem().toString().equals("Sony")){

                                                    Sony sony = new Sony();
                                                    arr= sony.getArray();
                                                    new Result(arr,min,max);

                                                }else if(brand.getSelectedItem().toString().equals("iPhone")){

                                                    iPhone iphone = new iPhone();
                                                    arr= iphone.getArray();
                                                    new Result(arr,min,max);

                                                }

                                            }else{
                                                JOptionPane.showMessageDialog(null, "Please choose a preferred screen size");
                                            }
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null, "The Maximum price field is not numeric");
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "The Minimum price field is not numeric");
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "The age field is not numeric");
                    }
                }


            }
        });

        ageField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e1) {
                try{
                    int i1 = Integer.parseInt(ageField.getText());
                    warningAgeTxt.setText("");
                }catch (NumberFormatException ee1){
                    warningAgeTxt.setText("Must be a number");
                }
            }
        });
        textFieldMin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e2) {
                try{
                    int i2 = Integer.parseInt(textFieldMin.getText());
                    warningMinTxt.setText("");
                }catch (NumberFormatException ee2){
                    warningMinTxt.setText("Must be a number");
                }
            }
        });
        textFieldMax.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e3) {
                try{
                    int i3 = Integer.parseInt(textFieldMax.getText());
                    warningMaxTxt.setText("");
                }catch (NumberFormatException ee3){
                    warningMaxTxt.setText("Must be a number");
                }
            }
        });

    }

    public static void main(String[] args) {

        //Initiating the panel
        //We can start now!
        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MainScreen().appView);

        frame.pack();
        frame.setSize(400,800);
        frame.setVisible(true);

    }


    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        // if exception isn't thrown, then it is an integer
        return true;
    }

}


