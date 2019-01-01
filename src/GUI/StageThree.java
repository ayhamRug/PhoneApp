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

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(stage == 3) {
            new ResultWindow().showWindowStage3_2(budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof.getSelectedIndex(),rearCameras.getSelectedIndex(),fingerprint.getSelectedIndex());
            this.dispose();
        } else if(stage > 3) {
            new StageFour(stage,budget,touchscreen,expandableStorage,dualSim,preferredBrand,displaySize,waterproof.getSelectedIndex(),rearCameras.getSelectedIndex(),fingerprint.getSelectedIndex());
            this.dispose();
        }
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

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(next)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(rearCamerasLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rearCameras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(waterproofLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(waterproof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(title)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(fingerprintLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fingerprint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(52, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(waterproofLabel)
                        .addComponent(waterproof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rearCamerasLabel)
                        .addComponent(rearCameras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(fingerprintLabel)
                        .addComponent(fingerprint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                    .addComponent(next)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
