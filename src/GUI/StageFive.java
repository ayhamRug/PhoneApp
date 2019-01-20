/*
 * Created by JFormDesigner on Tue Jan 01 16:35:31 CET 2019
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
public class StageFive extends JFrame {

    public int stage;
    public int budget;
    public int touchscreen;
    public int expandableStorage;
    public int dualSim;
    public int preferredBrand;
    public int displaySize;
    public int fingerprint;
    public int rearCameras;
    public int waterproof;
    public int rearCameraNumber;
    public int fingerprintPosition;

    public StageFive(int stageValue, int budgetValue, int touchscreenValue, int expandableStorageValue, int dualSimValue, int preferredBrandValue, int displaySizeValue, int fingerprintValue, int rearCamerasValue, int waterproofValue, int rearCameraNumberValue, int fingerprintPositionValue) {
        stage = stageValue;
        budget = budgetValue;
        touchscreen = touchscreenValue;
        expandableStorage = expandableStorageValue;
        dualSim = dualSimValue;
        displaySize = displaySizeValue;
        preferredBrand = preferredBrandValue;
        fingerprint = fingerprintValue;
        rearCameras = rearCamerasValue;
        waterproof = waterproofValue;
        fingerprintPosition = fingerprintPositionValue;
        rearCameraNumber = rearCameraNumberValue;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        initComponents();
    }

    // More to results when Submit is pressed.

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here

        new ResultWindow().showWindowStage5(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,fingerprint,rearCameras,waterproof,rearCameraNumber,fingerprintPosition,faceRecognition.getSelectedIndex(),pen.getSelectedIndex(),connector.getSelectedIndex(),headphoneJack.getSelectedIndex());
        this.dispose();
        dialog1.setVisible(false);
    }

    // Info windows

    private void faceRecognitionQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to have face recognition features?");
        answer.setText("<html>Except some of the Apple phones, any other phone would have face recognition feature. The only difference would " +
                "be the way face recognition works. Only newest Apple phones have face recognition and uses a scanner to identify you, " +
                "while all other phones would use the front facing camera to identify you. Considering this, Apple's face recognition " +
                "is more secure and more advanced.</html>");
        dialog1.setVisible(true);
    }

    private void penQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want the phone to have a pen/stylus?");
        answer.setText("<html>Phones that have a pen/stylus are rather big because they store the pen inside the phone case. " +
                "There are not that many phones with built-in pen/stylus, most of them are made by Samsung and LG. " +
                "You can use a 3rd party pen/stylus with any phone, but the phones that have it built-in, are way more accurate, " +
                "they have different pressure levels, can be used under water and they might have custom buttons as well.</html>");
        dialog1.setVisible(true);
    }

    private void connectorQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("What kind of connector would you like your phone to have?");
        answer.setText("<html>The newest phones have an usb typeC connector.<br>" +
                "Some new phones still use microUSB but those are more likely not to be high-end ones.<br>" +
                "Only iPhones from Apple are using the lightning connector.</html>");
        dialog1.setVisible(true);
    }

    private void headphoneQuestionActionPerformed(ActionEvent e) {
        // TODO add your code here

        question.setText("Do you want to have a headphone jack?");
        answer.setText("<html>Some of the newest phones don't have a headphone jack anymore. You can still use wired headphones but you would have " +
                "to buy a dongle (adapter). And if you use one of those adapters, you will most likely be limited to either use the headphones or " +
                "to charge your phone, so you won't be able to do both at the same time. This might change in the future.</html>");
        dialog1.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        label1 = new JLabel();
        label2 = new JLabel();
        faceRecognition = new JComboBox();
        label3 = new JLabel();
        pen = new JComboBox();
        label4 = new JLabel();
        connector = new JComboBox();
        label5 = new JLabel();
        headphoneJack = new JComboBox();
        next = new JButton();
        faceRecognitionQuestion = new JButton();
        penQuestion = new JButton();
        connectorQuestion = new JButton();
        headphoneQuestion = new JButton();
        label6 = new JLabel();
        label7 = new JLabel();
        dialog1 = new JDialog();
        question = new JLabel();
        answer = new JLabel();

        //======== this ========
        setTitle("Phone App - stage 5");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Phone App");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

        //---- label2 ----
        label2.setText("Do you want the phone to have face recognition features?");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 3f));

        //---- faceRecognition ----
        faceRecognition.addItem("Choose an item");
        faceRecognition.addItem("Yes");
        faceRecognition.addItem("No");
        faceRecognition.addItem("Not important");

        faceRecognition.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(faceRecognition.getSelectedIndex()==0 || pen.getSelectedIndex()==0 || connector.getSelectedIndex()==0 || headphoneJack.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- label3 ----
        label3.setText("Do you want the phone to have a pen/stylus?");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));

        //---- pen ----
        pen.addItem("Choose an item");
        pen.addItem("Yes");
        pen.addItem("No");
        pen.addItem("Not important");

        pen.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(faceRecognition.getSelectedIndex()==0 || pen.getSelectedIndex()==0 || connector.getSelectedIndex()==0 || headphoneJack.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- label4 ----
        label4.setText("What kind of connector would you like your phone to have?");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 3f));

        //---- connector ----
        connector.addItem("Choose an item");
        connector.addItem("MicroUSB");
        connector.addItem("TypeC");
        connector.addItem("Lightning");
        connector.addItem("Not important");

        connector.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(faceRecognition.getSelectedIndex()==0 || pen.getSelectedIndex()==0 || connector.getSelectedIndex()==0 || headphoneJack.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- label5 ----
        label5.setText("Do you want to have a headphone jack?");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 3f));

        //---- headphoneJack ----
        headphoneJack.addItem("Choose an item");
        headphoneJack.addItem("Yes");
        headphoneJack.addItem("No");
        headphoneJack.addItem("Not important");

        headphoneJack.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(faceRecognition.getSelectedIndex()==0 || pen.getSelectedIndex()==0 || connector.getSelectedIndex()==0 || headphoneJack.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- next ----
        next.setText("Submit");
        next.addActionListener(e -> submitActionPerformed(e));
        next.setEnabled(false);

        //---- faceRecognitionQuestion ----
        faceRecognitionQuestion.setText("?");
        faceRecognitionQuestion.addActionListener(e -> faceRecognitionQuestionActionPerformed(e));

        //---- penQuestion ----
        penQuestion.setText("?");
        penQuestion.addActionListener(e -> penQuestionActionPerformed(e));

        //---- connectorQuestion ----
        connectorQuestion.setText("?");
        connectorQuestion.addActionListener(e -> connectorQuestionActionPerformed(e));

        //---- headphoneQuestion ----
        headphoneQuestion.setText("?");
        headphoneQuestion.addActionListener(e -> headphoneQuestionActionPerformed(e));

        //---- label6 ----
        label6.setText("*If you don't know how to answer the questions, press on \"Info\" button");
        label6.setForeground(Color.black);

        //---- label7 ----
        label7.setText("More information is going to be provided");
        label7.setForeground(Color.black);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(faceRecognition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(faceRecognitionQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label6)
                                        .addComponent(next)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(label7)))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                            .addComponent(penQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(connector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addComponent(connectorQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(headphoneJack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                            .addComponent(headphoneQuestion, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(faceRecognition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(faceRecognitionQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(pen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(penQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(connector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(connectorQuestion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(headphoneJack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(headphoneQuestion))
                    .addGap(18, 18, 18)
                    .addComponent(label6)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label7)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(next)
                    .addGap(14, 14, 14))
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
                        .addGap(27, 27, 27)
                        .addComponent(question)
                        .addContainerGap(420, Short.MAX_VALUE))
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(answer, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                        .addContainerGap())
            );
            dialog1ContentPaneLayout.setVerticalGroup(
                dialog1ContentPaneLayout.createParallelGroup()
                    .addGroup(dialog1ContentPaneLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(question)
                        .addGap(18, 18, 18)
                        .addComponent(answer, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addContainerGap())
            );
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel label1;
    private JLabel label2;
    private JComboBox faceRecognition;
    private JLabel label3;
    private JComboBox pen;
    private JLabel label4;
    private JComboBox connector;
    private JLabel label5;
    private JComboBox headphoneJack;
    private JButton next;
    private JButton faceRecognitionQuestion;
    private JButton penQuestion;
    private JButton connectorQuestion;
    private JButton headphoneQuestion;
    private JLabel label6;
    private JLabel label7;
    private JDialog dialog1;
    private JLabel question;
    private JLabel answer;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
