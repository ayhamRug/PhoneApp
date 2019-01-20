/*
 * Created by JFormDesigner on Tue Jan 01 15:30:30 CET 2019
 */

package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Name
 */
public class StageThree extends JFrame {

    public int stage;
    public int budget;
    public int touchscreen;
    public int expandableStorage;
    public int dualSim;
    public int preferredBrand;
    public int displaySize;

    public StageThree(int stageValue, int budgetValue, int touchscreenValue, int expandableStorageValue, int dualSimValue, int preferredBrandValue, int displaySizeValue) {
        stage = stageValue;
        budget = budgetValue;
        touchscreen = touchscreenValue;
        expandableStorage = expandableStorageValue;
        dualSim = dualSimValue;
        preferredBrand = preferredBrandValue;
        displaySize = displaySizeValue;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        initComponents();
    }

    // Move to according windows based on previous answers

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(stage == 3) {
            new ResultWindow().showWindowStage3_2(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof.getSelectedIndex(),rearCameras.getSelectedIndex(),fingerprint.getSelectedIndex());
            dialog1.setVisible(false);
            this.dispose();
        } else if(stage > 3) {
            new StageFour(stage,budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof.getSelectedIndex(),rearCameras.getSelectedIndex(),fingerprint.getSelectedIndex());
            dialog1.setVisible(false);
            this.dispose();
        }
    }

    // Info windows

    private void waterproofQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to be waterproof?");
        answer.setText("<html>If a phone is waterproof, then you can drop it into water.<br>" +
                "Normally phones that are waterproof can resist for 30 minutes up to 1 meter depth of water.</html>");
        dialog1.setVisible(true);
    }

    private void multipleCamerasQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to have multiple rear cameras?");
        answer.setText("<html>In general, if a phone has multiple cameras it means it will take better pictures.<br><br>" +
                "Multiple cameras means that you'll have fixed optical zoom, so you won't have to rely on the software digital zoom." +
                "Also, it will take better pictures in the dark.</html>");
        dialog1.setVisible(true);
    }

    private void fingerprintQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to have a fingerprint scanner?");
        answer.setText("<html>Some of the newest phones don't rely on the fingerprint scanner anymore. They are going to implement some other" +
                " security features such as FaceID (Apple) or Iris Scanner (Samsung) but not only. Although, the majority will have a fingerprint " +
                "scanner.</html>");
        dialog1.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        title = new JLabel();
        waterproofLabel = new JLabel();
        rearCamerasLabel = new JLabel();
        fingerprintLabel = new JLabel();
        waterproof = new JComboBox();
        rearCameras = new JComboBox();
        fingerprint = new JComboBox();
        next = new JButton();
        waterproofQuestion = new JButton();
        multipleCamerasQuestion = new JButton();
        fingerprintQuestion = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        dialog1 = new JDialog();
        question = new JLabel();
        answer = new JLabel();

        //======== this ========
        setTitle("Phone app - Stage 3");
        Container contentPane = getContentPane();

        //---- title ----
        title.setText("Phone app");
        title.setFont(title.getFont().deriveFont(title.getFont().getSize() + 9f));

        //---- waterproofLabel ----
        waterproofLabel.setText("Do you want the phone to be waterproof?");
        waterproofLabel.setFont(waterproofLabel.getFont().deriveFont(waterproofLabel.getFont().getSize() + 3f));

        //---- rearCamerasLabel ----
        rearCamerasLabel.setText("Do you want the phone to have multiple rear cameras?");
        rearCamerasLabel.setFont(rearCamerasLabel.getFont().deriveFont(rearCamerasLabel.getFont().getSize() + 3f));

        //---- fingerprintLabel ----
        fingerprintLabel.setText("Do you want the phone to have a fingerprint scanner?");
        fingerprintLabel.setFont(fingerprintLabel.getFont().deriveFont(fingerprintLabel.getFont().getSize() + 3f));

        //---- waterproof ----
        waterproof.addItem("Choose an item");
        waterproof.addItem("Yes");
        waterproof.addItem("No");
        waterproof.addItem("Not important");

        waterproof.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(waterproof.getSelectedIndex()==0 || rearCameras.getSelectedIndex()==0 || fingerprint.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- rearCameras ----
        rearCameras.addItem("Choose an item");
        rearCameras.addItem("Yes");
        rearCameras.addItem("No");
        rearCameras.addItem("Not important");

        rearCameras.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(waterproof.getSelectedIndex()==0 || rearCameras.getSelectedIndex()==0 || fingerprint.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- fingerprint ----
        fingerprint.addItem("Choose an item");
        fingerprint.addItem("Yes");
        fingerprint.addItem("No");
        fingerprint.addItem("Not important");

        fingerprint.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(waterproof.getSelectedIndex()==0 || rearCameras.getSelectedIndex()==0 || fingerprint.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- next ----
        next.setText("Next");
        next.addActionListener(e -> submitActionPerformed(e));
        next.setEnabled(false);

        //---- waterproofQuestion ----
        waterproofQuestion.setText("?");
        waterproofQuestion.addActionListener(e -> waterproofQuestionActionPerformed(e));

        //---- multipleCamerasQuestion ----
        multipleCamerasQuestion.setText("?");
        multipleCamerasQuestion.addActionListener(e -> multipleCamerasQuestionActionPerformed(e));

        //---- fingerprintQuestion ----
        fingerprintQuestion.setText("?");
        fingerprintQuestion.addActionListener(e -> fingerprintQuestionActionPerformed(e));

        //---- label2 ----
        label2.setText("*If you don't know how to answer the questions, press on \"Info\" button");
        label2.setForeground(Color.black);

        //---- label3 ----
        label3.setText("More information is going to be provided");
        label3.setForeground(Color.black);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(rearCamerasLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rearCameras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(multipleCamerasQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(waterproofLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(waterproof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                            .addComponent(waterproofQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(fingerprintLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fingerprint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(fingerprintQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(next)
                                .addComponent(title)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(label3)))
                            .addGap(0, 163, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(waterproofLabel)
                        .addComponent(waterproof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(waterproofQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rearCamerasLabel)
                        .addComponent(rearCameras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(multipleCamerasQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(fingerprintLabel)
                        .addComponent(fingerprint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(fingerprintQuestion))
                    .addGap(26, 26, 26)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addComponent(next)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //======== dialog1 ========
        {
            dialog1.setTitle("Info");
            Container dialog1ContentPane = dialog1.getContentPane();

            //---- question ----
            question.setText("Question?");
            question.setFont(question.getFont().deriveFont(question.getFont().getSize() + 3f));

            //---- answer ----
            answer.setText("Answer");

            GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
            dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
            dialog1ContentPaneLayout.setHorizontalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(question)
                        .addContainerGap(341, Short.MAX_VALUE))
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(answer, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addContainerGap())
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(question)
                        .addGap(18, 18, 18)
                        .addComponent(answer, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addContainerGap())
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel title;
    private JLabel waterproofLabel;
    private JLabel rearCamerasLabel;
    private JLabel fingerprintLabel;
    private JComboBox waterproof;
    private JComboBox rearCameras;
    private JComboBox fingerprint;
    private JButton next;
    private JButton waterproofQuestion;
    private JButton multipleCamerasQuestion;
    private JButton fingerprintQuestion;
    private JLabel label2;
    private JLabel label3;
    private JDialog dialog1;
    private JLabel question;
    private JLabel answer;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
