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

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here

        new ResultWindow().showWindowStage5(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,fingerprint,rearCameras,waterproof,rearCameraNumber,fingerprintPosition,faceRecognition.getSelectedIndex(),pen.getSelectedIndex(),connector.getSelectedIndex(),headphoneJack.getSelectedIndex());
        this.dispose();
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

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(faceRecognition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(84, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(connector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(headphoneJack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(next)))
                            .addGap(0, 74, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(faceRecognition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(pen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(connector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(headphoneJack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                    .addComponent(next)
                    .addGap(14, 14, 14))
        );
        pack();
        setLocationRelativeTo(getOwner());
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
