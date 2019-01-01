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

public class BudgetWindow extends JFrame {

    public int state = 1;

    public void showWindow() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    public BudgetWindow() {
        initComponents();
    }

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here

        if(Integer.parseInt(max.getText())<=50) {
            state = 1;
        } else if (Integer.parseInt(max.getText())<=150 && Integer.parseInt(max.getText())>50) {
            state = 2;
        } else if (Integer.parseInt(max.getText())<=300 && Integer.parseInt(max.getText())>150) {
            state = 3;
        } else if (Integer.parseInt(max.getText())<=600 && Integer.parseInt(max.getText())>300) {
            state = 4;
        } else if (Integer.parseInt(max.getText())>600) {
            state = 5;
        }

        new StageOne(state,Integer.parseInt(max.getText()));
        this.dispose();

        System.out.println(state);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        Title = new JLabel();
        budgetLabel = new JLabel();
        max = new JTextField();
        submit = new JButton();
        budgetFieldRequired = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phone App - Budget");
        setFont(new Font("Dialog", Font.PLAIN, 13));
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Phone App");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 9f));
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Title.setHorizontalTextPosition(SwingConstants.CENTER);

        //---- budgetLabel ----
        budgetLabel.setText("What is your maximum budget?");
        budgetLabel.setFont(budgetLabel.getFont().deriveFont(budgetLabel.getFont().getSize() + 3f));

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
            if (max.getText().equals("")) {
                submit.setEnabled(false);
                budgetFieldRequired.setText("*this field is required!");
                budgetFieldRequired.setVisible(true);
            } else {
                if (!max.getText().matches(regex)) {
                    budgetFieldRequired.setText("*this field should contain only numbers!");
                    budgetFieldRequired.setVisible(true);
                } else {
                    budgetFieldRequired.setVisible(false);
                    submit.setEnabled(true);
                }
            }
        }
        });

        //---- submit ----
        submit.setText("Next");
        submit.addActionListener(e -> submitActionPerformed(e));
        submit.setEnabled(false);

        //---- budgetFieldRequired ----
        budgetFieldRequired.setText("*this field is required");
        budgetFieldRequired.setForeground(new Color(255, 0, 51));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(submit)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(Title)
                                        .addComponent(budgetLabel))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(budgetFieldRequired, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(123, 123, 123))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title)
                    .addGap(18, 18, 18)
                    .addComponent(budgetLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(budgetFieldRequired, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(submit)
                    .addContainerGap(23, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel Title;
    private JLabel budgetLabel;
    private JTextField max;
    private JButton submit;
    private JLabel budgetFieldRequired;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
