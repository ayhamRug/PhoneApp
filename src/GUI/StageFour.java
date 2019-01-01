/*
 * Created by JFormDesigner on Tue Jan 01 16:23:28 CET 2019
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
public class StageFour extends JFrame {

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

    public StageFour(int stageValue, int budgetValue, int touchscreenValue, int expandableStorageValue, int dualSimValue, int preferredBrandValue, int displaySizeValue,int waterproofValue, int rearCamerasValue, int fingerprintValue) {
        stage = stageValue;
        budget=budgetValue;
        touchscreen = touchscreenValue;
        expandableStorage = expandableStorageValue;
        dualSim = dualSimValue;
        preferredBrand = preferredBrandValue;
        displaySize = displaySizeValue;
        rearCameras = rearCamerasValue;
        waterproof = waterproofValue;
        fingerprint = fingerprintValue;

        if(rearCamerasValue == 1 || fingerprintValue == 1) {
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            this.pack();
            this.setResizable(false);
            this.setVisible(true);

            initComponents();

            if(rearCamerasValue != 1) rearCameraNumber.setEnabled(false);
            if(fingerprintValue != 1) fingerprintLocation.setEnabled(false);


        } else if (stage==4 && rearCamerasValue != 1 && fingerprintValue != 1) {
            new ResultWindow().showWindowStage3_2(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof,rearCameras,fingerprint);
            this.dispose();
        } else if (stage>4 && rearCamerasValue != 1 && fingerprintValue != 1) {
            new StageFive(stage, budget, touchscreen,expandableStorage, dualSim, preferredBrand, displaySize, fingerprint,rearCameras,waterproof,4,5);
        }
    }

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(stage == 4 && rearCameras==1 && fingerprint==1) {
            new ResultWindow().showWindowStage4_1(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof,rearCameras,fingerprint,fingerprintLocation.getSelectedIndex(),rearCameraNumber.getSelectedIndex());
            this.dispose();
        } else if (stage == 4 && rearCameras == 1 && fingerprint!=1) {
            new ResultWindow().showWindowStage4_3(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof,rearCameras,fingerprint,rearCameraNumber.getSelectedIndex());
            this.dispose();
        } else if (stage == 4 && rearCameras != 1 && fingerprint == 1) {
            new ResultWindow().showWindowStage4_2(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof,rearCameras,fingerprint,fingerprintLocation.getSelectedIndex());
            this.dispose();
        } else if(stage > 4) {
            if(rearCameras == 1 && fingerprint == 1) {
                new StageFive(stage, budget, touchscreen, expandableStorage, dualSim, preferredBrand, displaySize, fingerprint, rearCameras, waterproof, rearCameraNumber.getSelectedIndex(), fingerprintLocation.getSelectedIndex());
                this.dispose();
            } else if (rearCameras == 1 && fingerprint!= 1) {
                new StageFive(stage, budget, touchscreen, expandableStorage, dualSim, preferredBrand, displaySize, fingerprint, rearCameras, waterproof, rearCameraNumber.getSelectedIndex(), 5);
                this.dispose();
            } else if (rearCameras != 1 && fingerprint == 1) {
                new StageFive(stage, budget, touchscreen, expandableStorage, dualSim, preferredBrand, displaySize, fingerprint, rearCameras, waterproof, 4, fingerprintLocation.getSelectedIndex());
                this.dispose();
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        label1 = new JLabel();
        label2 = new JLabel();
        fingerprintLocation = new JComboBox();
        label3 = new JLabel();
        rearCameraNumber = new JComboBox();
        next = new JButton();

        //======== this ========
        setTitle("Phone App - stage 4");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Phone App");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

        //---- label2 ----
        label2.setText("Where would you like to have the fingerprint scanner?");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 3f));

        //---- fingerprintLocation ----
        fingerprintLocation.addItem("Choose an option");
        fingerprintLocation.addItem("In the back");
        fingerprintLocation.addItem("In the front");
        fingerprintLocation.addItem("On the side");
        fingerprintLocation.addItem("Underneath the display");
        fingerprintLocation.addItem("Not important");

        if(fingerprint != 1) fingerprintLocation.setEnabled(false);

        fingerprintLocation.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(fingerprintLocation.isEnabled()==true && rearCameraNumber.isEnabled()==true && (fingerprintLocation.getSelectedIndex()==0 || rearCameraNumber.getSelectedIndex()==0)) next.setEnabled(false);
                else if(fingerprintLocation.isEnabled()==false && rearCameraNumber.isEnabled()==true && rearCameraNumber.getSelectedIndex()==0) next.setEnabled(false);
                else if(fingerprintLocation.isEnabled()==true && rearCameraNumber.isEnabled()==false && fingerprintLocation.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
        }
        });

        //---- label3 ----
        label3.setText("How many rear cameras do you want?");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));

        //---- rearCameraNumber ----
        rearCameraNumber.addItem("Choose an option");
        rearCameraNumber.addItem("2");
        rearCameraNumber.addItem("3");
        rearCameraNumber.addItem("4");
        rearCameraNumber.addItem("Not important");

        if(rearCameras != 1) rearCameraNumber.setEnabled(false);

        rearCameraNumber.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(fingerprintLocation.isEnabled()==true && rearCameraNumber.isEnabled()==true && (fingerprintLocation.getSelectedIndex()==0 || rearCameraNumber.getSelectedIndex()==0)) next.setEnabled(false);
                else if(fingerprintLocation.isEnabled()==false && rearCameraNumber.isEnabled()==true && rearCameraNumber.getSelectedIndex()==0) next.setEnabled(false);
                else if(fingerprintLocation.isEnabled()==true && rearCameraNumber.isEnabled()==false && fingerprintLocation.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
        }
        });

        //---- next ----
        next.setText("Next");
        next.addActionListener(e -> submitActionPerformed(e));
        next.setEnabled(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fingerprintLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rearCameraNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(next))
                    .addContainerGap(121, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(fingerprintLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(rearCameraNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                    .addComponent(next)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel label1;
    private JLabel label2;
    private JComboBox fingerprintLocation;
    private JLabel label3;
    private JComboBox rearCameraNumber;
    private JButton next;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
