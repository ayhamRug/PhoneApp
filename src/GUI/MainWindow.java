package GUI;

import BusinessLogic.Phones;
import Common.Common;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;

public class MainWindow {

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
    private JButton submitBtn;

    private ArrayList<String> validationErrors;

    public MainWindow() {
        validationErrors = new ArrayList<>();

        ButtonGroup screenG = new ButtonGroup();
        screenG.add(bigScreen5RadioButton);
        screenG.add(smallScreen5RadioButton);

        submitBtn.addActionListener(e -> onSubmit());

        ageField.getDocument().addDocumentListener(createDocumentListenerForNumericTextField(ageField, warningAgeTxt));
        textFieldMin.getDocument().addDocumentListener(createDocumentListenerForNumericTextField(textFieldMin, warningMinTxt));
        textFieldMax.getDocument().addDocumentListener(createDocumentListenerForNumericTextField(textFieldMax, warningMaxTxt));
    }

    private boolean validateInput(){
        if(ageField.getText().isEmpty())
            validationErrors.add("Age field is required!");
        else if (!Common.isInteger(ageField.getText()))
            validationErrors.add("Age must me an integer value");

        if(textFieldMin.getText().isEmpty())
            validationErrors.add("Min field is required!");
        else if(!Common.isInteger(textFieldMin.getText()))
            validationErrors.add("Min value must me a numeric value");

        if(textFieldMax.getText().isEmpty())
            validationErrors.add("Max field is required!");
        else if(!Common.isInteger(textFieldMax.getText()))
            validationErrors.add("Max value must me a numeric value");
        else if(Integer.parseInt(textFieldMin.getText()) > Integer.parseInt(textFieldMax.getText()))
            validationErrors.add("The Maximum price is less than the Minimum!");

        if(!bigScreen5RadioButton.isSelected() && !smallScreen5RadioButton.isSelected())
            validationErrors.add("Please choose a preferred screen size");

        if(validationErrors.size() > 0)
            return false;

        return true;
    }

    private void onSubmit(){
        // if there are any validation errors, output them and cancel any further actions
        //
        if(!validateInput()){
            StringBuilder validationResult = new StringBuilder();

            for (String error : validationErrors) {
                validationResult.append(error);
                validationResult.append("\n");
            }

            // TODO: now errors are shown in labels as well as in message box. It's better to use only one of them.

            JOptionPane.showMessageDialog(null, validationResult);

            validationErrors.clear();
            return;
        }

        // no validation errors, perform submitBtn

        // getting all of the values from the starting interface to show them in a separate window for testing now.
        outputInputParameters();

        // Initialize variables to store important values so far
        int min = Integer.parseInt(textFieldMin.getText());
        int max = Integer.parseInt(textFieldMax.getText());

        // Get the array following to the brand (just for the prototype) and show the results in the result class
        //ArrayList<String[]> arr = null; //getPhoneByBrand(brand.getSelectedItem().toString()).get();

        String selectedBrand = brand.getSelectedItem().toString();

        new ResultWindow(Phones.getByBrand(selectedBrand), min, max);
    }

    private DocumentListener createDocumentListenerForNumericTextField(JTextField inputTextField, JLabel errorLabel){
        return new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (inputTextField.getText().isEmpty())
                    errorLabel.setText("Field is required!");
                else if (!Common.isInteger(inputTextField.getText()))
                    errorLabel.setText("Must be a number!");
                else
                    errorLabel.setText("");
            }
        };
    }

    // only for testing purposes
    // TODO: remove in a final version
    private void outputInputParameters(){
        String rb;

        if(bigScreen5RadioButton.isSelected())
            rb = bigScreen5RadioButton.getText();
        else
            rb = smallScreen5RadioButton.getText();

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
    }

    public JPanel getAppView(){
        return appView;
    }
}


