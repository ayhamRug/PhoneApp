/*
 * Created by JFormDesigner on Mon Jan 14 12:33:47 CET 2019
 */

package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.xml.transform.Result;

/**
 * @author Name
 */
public class StageOne extends JFrame {

    public int stage;
    public int budget;
    public static final int currentStage = 1;

    public StageOne(int stageValue, int budgetValue) {
        stage = stageValue;
        budget = budgetValue;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        initComponents();
    }

    // Info windows

    private void phoneTypeQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("What kind of phone would you like?");
        if(stage == 1 || stage == 2) {
            explanation.setText("<html> With touchscreen: The phone will have only touchscreen, no keypad.<br><br>" +
                    "With keypad: The phone won't have touchscreen capability, it would only have the traditional keypad.<br><br>" +
                    "Not important: The application is going to consider both kind of phones.</html>");
        } else {
            explanation.setText("<html> With touchscreen: The phone will have only touchscreen, no keypad.<br><br>" +
                    "With keypad: The phone won't have touchscreen capability, it would only have the traditional keypad.<br><br>" +
                    "With touchscreen + keypad: The phone will have both touchscreen and keypad.<br><br>" +
                    "Not important: The application is going to consider any kind of phone.</html>");
        }
        dialog1.setVisible(true);
    }

    private void expStorageQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want expandable storage?");
        explanation.setText("<html> Yes: The phone will have have a microSD slot.<br><br>" +
                "No: The phone won't have a microSD slot.<br><br>" +
                "Not important: The application is going to consider both kind of phones.</html>");
        dialog1.setVisible(true);
    }

    private void dualSimQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to be dual sim?");
        explanation.setText("<html> Yes: The phone will have have a second SIM slot.<br><br>" +
                "No: The phone won't have a second SIM slot.<br><br>" +
                "Not important: The application is going to consider both kind of phones.</html>");
        dialog1.setVisible(true);
    }

    // Move to according windows based on previous answers

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here

        if(stage == 1) {
            new ResultWindow().showWindowStage1(budget,touchscreen.getSelectedIndex(),expandableStorage.getSelectedIndex(),dualSim.getSelectedIndex());
            this.dispose();
            dialog1.setVisible(false);
        } else if (stage == 2 && next.getText()=="Search") {
            new ResultWindow().showWindowStage1(budget,touchscreen.getSelectedIndex(),expandableStorage.getSelectedIndex(),dualSim.getSelectedIndex());
            this.dispose();
            dialog1.setVisible(false);
        } else if (stage == 2 && next.getText()=="Next") {
            new StageTwo(stage, budget, touchscreen.getSelectedIndex(), expandableStorage.getSelectedIndex(), dualSim.getSelectedIndex());
            this.dispose();
            dialog1.setVisible(false);
        } else if (stage>2) {
            new StageTwo(stage, budget, touchscreen.getSelectedIndex(), expandableStorage.getSelectedIndex(), dualSim.getSelectedIndex());
            this.dispose();
            dialog1.setVisible(false);
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        Title = new JLabel();
        phoneType = new JLabel();
        touchscreen = new JComboBox();
        next = new JButton();
        ExpandableStorageLabel = new JLabel();
        expandableStorage = new JComboBox();
        dualSimLabel = new JLabel();
        dualSim = new JComboBox();
        label3 = new JLabel();
        label4 = new JLabel();
        phoneTypeQuestion = new JButton();
        expStorageQuestion = new JButton();
        dualSimQuestion = new JButton();
        dialog1 = new JDialog();
        question = new JLabel();
        explanation = new JLabel();

        //======== this ========
        setTitle("Phone App - Stage 1");
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Phone App");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 9f));

        //---- phoneType ----
        phoneType.setText("What kind of phone would you like?");
        phoneType.setFont(phoneType.getFont().deriveFont(phoneType.getFont().getSize() + 3f));

        //---- touchscreen ----
        if(stage == 1 || stage == 2) {
            touchscreen.addItem("Choose an option");
            touchscreen.addItem("With Touchscreen");
            touchscreen.addItem("With Keypad");
            touchscreen.addItem("Not Important");
        } else if (stage > 2) {
            touchscreen.addItem("Choose an option");
            touchscreen.addItem("With Touchscreen");
            touchscreen.addItem("With Keypad");
            touchscreen.addItem("With Touchscreen+Keypad");
            touchscreen.addItem("Not Important");
        }

        touchscreen.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(touchscreen.getSelectedIndex()==0 || expandableStorage.getSelectedIndex()==0 || dualSim.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);

                if(stage==2 && touchscreen.getSelectedIndex()==2) next.setText("Search");
                else if(stage==2 && touchscreen.getSelectedIndex()!=2) next.setText("Next");
             }
         });

        //---- next ----
        next.setText("Next");
        if(stage==1) next.setText("Search");
        next.addActionListener(e -> submitActionPerformed(e));
        next.setEnabled(false);

        //---- ExpandableStorageLabel ----
        ExpandableStorageLabel.setText("Do you want expandable storage?");
        ExpandableStorageLabel.setFont(ExpandableStorageLabel.getFont().deriveFont(ExpandableStorageLabel.getFont().getSize() + 3f));

        //---- expandableStorage ----
        expandableStorage.addItem("Choose an option");
        expandableStorage.addItem("Yes");
        expandableStorage.addItem("No");
        expandableStorage.addItem("Not Important");

        expandableStorage.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(touchscreen.getSelectedIndex()==0 || expandableStorage.getSelectedIndex()==0 || dualSim.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- dualSimLabel ----
        dualSimLabel.setText("Do you want the phone to be dual sim?");
        dualSimLabel.setFont(dualSimLabel.getFont().deriveFont(dualSimLabel.getFont().getSize() + 3f));

        //---- dualSim ----
        dualSim.addItem("Choose an option");
        dualSim.addItem("Yes");
        dualSim.addItem("No");
        dualSim.addItem("Not Important");

        dualSim.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(touchscreen.getSelectedIndex()==0 || expandableStorage.getSelectedIndex()==0 || dualSim.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- label3 ----
        label3.setText("*If you don't know how to answer the questions, press on \"Info\" button");
        label3.setForeground(Color.black);

        //---- label4 ----
        label4.setText("More information is going to be provided");
        label4.setForeground(Color.black);

        //---- phoneTypeQuestion ----
        phoneTypeQuestion.setText("?");
        phoneTypeQuestion.addActionListener(e -> phoneTypeQuestionActionPerformed(e));

        //---- expStorageQuestion ----
        expStorageQuestion.setText("?");
        expStorageQuestion.addActionListener(e -> expStorageQuestionActionPerformed(e));

        //---- dualSimQuestion ----
        dualSimQuestion.setText("?");
        dualSimQuestion.addActionListener(e -> dualSimQuestionActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(Title))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label3)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(next)
                                        .addComponent(label4)))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(ExpandableStorageLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(expandableStorage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(dualSimLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dualSim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(phoneType)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(touchscreen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(dualSimQuestion, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(expStorageQuestion, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(phoneTypeQuestion, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneType)
                        .addComponent(touchscreen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneTypeQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ExpandableStorageLabel)
                        .addComponent(expandableStorage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(expStorageQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(dualSimLabel)
                        .addComponent(dualSim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(dualSimQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label4)
                    .addGap(18, 18, 18)
                    .addComponent(next)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //======== dialog1 ========
        {
            dialog1.setTitle("Info");
            dialog1.setResizable(false);
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- question ----
            question.setText("Text1");
            question.setFont(question.getFont().deriveFont(question.getFont().getSize() + 3f));

            //---- explanation ----
            explanation.setText("Explanation");

            GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
            dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
            dialog1ContentPaneLayout.setHorizontalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGroup(dialog1ContentPaneLayout.createParallelGroup()
                            .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(question))
                            .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(explanation)))
                        .addContainerGap(345, Short.MAX_VALUE))
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(question)
                        .addGap(27, 27, 27)
                        .addComponent(explanation)
                        .addContainerGap(200, Short.MAX_VALUE))
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel Title;
    private JLabel phoneType;
    private JComboBox touchscreen;
    private JButton next;
    private JLabel ExpandableStorageLabel;
    private JComboBox expandableStorage;
    private JLabel dualSimLabel;
    private JComboBox dualSim;
    private JLabel label3;
    private JLabel label4;
    private JButton phoneTypeQuestion;
    private JButton expStorageQuestion;
    private JButton dualSimQuestion;
    private JDialog dialog1;
    private JLabel question;
    private JLabel explanation;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
