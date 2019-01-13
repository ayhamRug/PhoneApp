/*
 * Created by JFormDesigner on Mon Dec 17 10:33:32 CET 2018
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import BusinessLogic.*;

public class InputWindow extends JFrame {
    public void showWindow() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    public InputWindow() {
        initComponents();
    }

    private void submitActionPerformed(ActionEvent e) throws IOException {
        // TODO add your code here
        int expStorage=0, display=0, dualSim=0, waterproof=0;
        System.out.println(expStorage);

        if(expandableStorage.getSelectedIndex()==1) expStorage=1;
        else if(expandableStorage.getSelectedIndex()==2) expStorage=2;

        if(screenSize.getSelectedIndex()==1) display=1;
        else if(screenSize.getSelectedIndex()==2) display=2;

        if(dualSimBox.getSelectedIndex()==1) dualSim=1;
        else if(dualSimBox.getSelectedIndex()==2) dualSim=2;

        if(WaterproofBox.getSelectedIndex()==1) waterproof=1;
        else if(WaterproofBox.getSelectedIndex()==2) waterproof=2;

        System.out.println(expStorage);

        new ResultWindow().showWindow(Integer.parseInt(min.getText()),Integer.parseInt(max.getText()),Integer.parseInt(age.getText()),
                brandComboBox.getSelectedItem().toString(), expStorage, display,dualSim,waterproof);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - John
        Title = new JLabel();
        budgetLabel = new JLabel();
        min = new JTextField();
        max = new JTextField();
        ageLabel = new JLabel();
        age = new JTextField();
        brandLabel = new JLabel();
        brandComboBox = new JComboBox();
        expStorageLabel = new JLabel();
        expandableStorage = new JComboBox();
        displayLabel = new JLabel();
        screenSize = new JComboBox();
        otherLabel = new JLabel();
        submit = new JButton();
        label1 = new JLabel();
        label3 = new JLabel();
        budgetFieldRequired = new JLabel();
        ageFieldRequired = new JLabel();
        dualSimBox = new JComboBox();
        WaterproofBox = new JComboBox();
        Preference = new JComboBox();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phone App - Input");
        setFont(new Font("Dialog", Font.PLAIN, 13));
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Phone App");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 9f));
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Title.setHorizontalTextPosition(SwingConstants.CENTER);

        //---- budgetLabel ----
        budgetLabel.setText("Budget (min-max):");
        budgetLabel.setFont(budgetLabel.getFont().deriveFont(budgetLabel.getFont().getSize() + 3f));

        //---- min ----
        min.setColumns(1);
        min.setMinimumSize(new Dimension(50, 25));
        min.setPreferredSize(new Dimension(50, 25));
        min.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate (DocumentEvent e){
            changed();
        }
        public void removeUpdate (DocumentEvent e){
            changed();
        }
        public void insertUpdate (DocumentEvent e){
            changed();
        }

        public void changed () {
            String regex = "\\d+";
            if (max.getText().equals("") || min.getText().equals("")) {
                submit.setEnabled(false);
                budgetFieldRequired.setText("*these fields are required!");
                budgetFieldRequired.setVisible(true);
            } else {
                if (!max.getText().matches(regex) || !min.getText().matches(regex)) {
                    budgetFieldRequired.setText("*these fields should contain only numbers!");
                    budgetFieldRequired.setVisible(true);
                } else {
                    budgetFieldRequired.setVisible(false);
                    if (age.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
            if (age.getText().equals("")) {
                submit.setEnabled(false);
                ageFieldRequired.setText("*this field is required!");
                ageFieldRequired.setVisible(true);
            } else {
                if (!age.getText().matches(regex)) {
                    ageFieldRequired.setText("*this field should contain only numbers!");
                    ageFieldRequired.setVisible(true);
                } else {
                    ageFieldRequired.setVisible(false);
                    if (max.getText().matches(regex) && min.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
        }
        });

        //---- max ----
        max.setMinimumSize(new Dimension(50, 25));
        max.setPreferredSize(new Dimension(50, 25));
        max.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate (DocumentEvent e){
            changed();
        }
        public void removeUpdate (DocumentEvent e){
            changed();
        }
        public void insertUpdate (DocumentEvent e){
            changed();
        }

        public void changed () {
            String regex = "\\d+";
            if (max.getText().equals("") || min.getText().equals("")) {
                submit.setEnabled(false);
                budgetFieldRequired.setText("*these fields are required!");
                budgetFieldRequired.setVisible(true);
            } else {
                if (!max.getText().matches(regex) || !min.getText().matches(regex)) {
                    budgetFieldRequired.setText("*these fields should contain only numbers!");
                    budgetFieldRequired.setVisible(true);
                } else {
                    budgetFieldRequired.setVisible(false);
                    if (age.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
            if (age.getText().equals("")) {
                submit.setEnabled(false);
                ageFieldRequired.setText("*this field is required!");
                ageFieldRequired.setVisible(true);
            } else {
                if (!age.getText().matches(regex)) {
                    ageFieldRequired.setText("*this field should contain only numbers!");
                    ageFieldRequired.setVisible(true);
                } else {
                    ageFieldRequired.setVisible(false);
                    if (max.getText().matches(regex) && min.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
        }
        });

        //---- ageLabel ----
        ageLabel.setText("What age will the user have?");
        ageLabel.setFont(ageLabel.getFont().deriveFont(ageLabel.getFont().getSize() + 3f));

        //---- age ----
        age.setColumns(1);
        age.setMinimumSize(new Dimension(50, 25));
        age.setPreferredSize(new Dimension(50, 25));
        age.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate (DocumentEvent e){
            changed();
        }
        public void removeUpdate (DocumentEvent e){
            changed();
        }
        public void insertUpdate (DocumentEvent e){
            changed();
        }

        public void changed () {
            String regex = "\\d+";
            if (max.getText().equals("") || min.getText().equals("")) {
                submit.setEnabled(false);
                budgetFieldRequired.setText("*these fields are required!");
                budgetFieldRequired.setVisible(true);
            } else {
                if (!max.getText().matches(regex) || !min.getText().matches(regex)) {
                    budgetFieldRequired.setText("*these fields should contain only numbers!");
                    budgetFieldRequired.setVisible(true);
                } else {
                    budgetFieldRequired.setVisible(false);
                    if (age.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
            if (age.getText().equals("")) {
                submit.setEnabled(false);
                ageFieldRequired.setText("*this field is required!");
                ageFieldRequired.setVisible(true);
            } else {
                if (!age.getText().matches(regex)) {
                    ageFieldRequired.setText("*this field should contain only numbers!");
                    ageFieldRequired.setVisible(true);
                } else {
                    ageFieldRequired.setVisible(false);
                    if (max.getText().matches(regex) && min.getText().matches(regex)) {
                        submit.setEnabled(true);
                    }
                }
            }
        }
        });

        //---- brandLabel ----
        brandLabel.setText("What is your prefered brand?");
        brandLabel.setFont(brandLabel.getFont().deriveFont(brandLabel.getFont().getSize() + 3f));

        //---- brandComboBox ----
        brandComboBox.setMinimumSize(new Dimension(98, 30));
        for (Phone.PhoneBrandSelector brand : Phone.PhoneBrandSelector.values()) {
                    brandComboBox.addItem(brand.toString());
               }

        //---- expStorageLabel ----
        expStorageLabel.setText("Do you want expandable storage?");
        expStorageLabel.setFont(expStorageLabel.getFont().deriveFont(expStorageLabel.getFont().getSize() + 3f));

        //---- expandableStorage ----
        expandableStorage.setMinimumSize(new Dimension(98, 30));
        for(Phone.ExpandableStorage option : Phone.ExpandableStorage.values()) {
                    expandableStorage.addItem(option);
                }

        //---- displayLabel ----
        displayLabel.setText("Any display size preferences?");
        displayLabel.setFont(displayLabel.getFont().deriveFont(displayLabel.getFont().getSize() + 3f));

        //---- screenSize ----
        screenSize.addItem("None");
        screenSize.addItem("Bigger than 5.2\"");
        screenSize.addItem("Smaller than 5.2\"");

        //---- otherLabel ----
        otherLabel.setText("Do you have any specific preferences?");
        otherLabel.setFont(otherLabel.getFont().deriveFont(otherLabel.getFont().getSize() + 3f));

        //---- submit ----
        submit.setText("Search");
        submit.addActionListener(e -> {
            try {
                submitActionPerformed(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        submit.setEnabled(false);

        //---- label1 ----
        label1.setText("Dual sim capability?");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 3f));

        //---- label3 ----
        label3.setText("Waterproof?");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));

        //---- budgetFieldRequired ----
        budgetFieldRequired.setText("*these fields are required!");
        budgetFieldRequired.setForeground(new Color(255, 0, 51));

        //---- ageFieldRequired ----
        ageFieldRequired.setText("*this field is required!");
        ageFieldRequired.setForeground(new Color(255, 0, 51));

        //---- dualSimBox ----
        dualSimBox.addItem("Not important");
        dualSimBox.addItem("Yes");
        dualSimBox.addItem("No");

        //---- WaterproofBox ----
        WaterproofBox.addItem("Not important");
        WaterproofBox.addItem("Yes");
        WaterproofBox.addItem("No");

        //---- Preference ----
        Preference.addItem("No preferences");
        Preference.addItem("Better battery");
        Preference.addItem("Better performance");
        Preference.addItem("Better design");
        Preference.addItem("Better camera");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(brandLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(brandComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(expStorageLabel)
                                    .addGap(6, 6, 6)
                                    .addComponent(expandableStorage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(displayLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(screenSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dualSimBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(ageLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(age, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ageFieldRequired))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WaterproofBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(submit)
                                        .addComponent(otherLabel))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Preference, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 75, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(budgetLabel)
                            .addGap(12, 12, 12)
                            .addComponent(min, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(budgetFieldRequired, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(Title)
                    .addContainerGap(189, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(budgetLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(min, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(budgetFieldRequired, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))))
                    .addGap(8, 8, 8)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(ageFieldRequired, GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                    .addGap(11, 11, 11)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(brandLabel)
                        .addComponent(brandComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(expStorageLabel))
                        .addComponent(expandableStorage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(screenSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayLabel))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(dualSimBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(WaterproofBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(otherLabel)
                        .addComponent(Preference, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                    .addComponent(submit)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - John
    private JLabel Title;
    private JLabel budgetLabel;
    private JTextField min;
    private JTextField max;
    private JLabel ageLabel;
    private JTextField age;
    private JLabel brandLabel;
    private JComboBox brandComboBox;
    private JLabel expStorageLabel;
    private JComboBox expandableStorage;
    private JLabel displayLabel;
    private JComboBox screenSize;
    private JLabel otherLabel;
    private JButton submit;
    private JLabel label1;
    private JLabel label3;
    private JLabel budgetFieldRequired;
    private JLabel ageFieldRequired;
    private JComboBox dualSimBox;
    private JComboBox WaterproofBox;
    private JComboBox Preference;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
