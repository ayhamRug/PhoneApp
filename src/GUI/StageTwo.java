/*
 * Created by JFormDesigner on Tue Jan 01 14:35:03 CET 2019
 */

package GUI;

import BusinessLogic.Phone;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Name
 */
public class StageTwo extends JFrame {

    public int stage;
    public int budget;
    public int touchscreen;
    public int expandableStorage;
    public int dualSim;

    public StageTwo(int stageValue, int budgetValue, int touchscreenValue, int expandableStorageValue, int dualSimValue) {
        stage = stageValue;
        budget = budgetValue;
        touchscreen = touchscreenValue;
        expandableStorage = expandableStorageValue;
        dualSim = dualSimValue;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        initComponents();
    }

    private void submitActionPerformed(ActionEvent e) {
        // TODO add your code here
        if(stage==2) {
            new ResultWindow().showWindowStage2(budget, touchscreen, expandableStorage, dualSim, preferredBrand.getSelectedIndex(), displaySize.getSelectedIndex());
            this.dispose();
        } else if(stage > 2) {
            if(touchscreen==3 || touchscreen == 2) {
                new ResultWindow().showWindowStage3_1(budget, touchscreen, expandableStorage, dualSim, preferredBrand.getSelectedIndex(), displaySize.getSelectedIndex());
                this.dispose();
            } else {
                new StageThree(stage, budget, touchscreen, expandableStorage, dualSim, preferredBrand.getSelectedIndex(), displaySize.getSelectedIndex());
                this.dispose();
            }
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        titleLabel = new JLabel();
        preferredBrandLabel = new JLabel();
        preferredBrand = new JComboBox();
        displaySizeLabel = new JLabel();
        displaySize = new JComboBox();
        next = new JButton();

        //======== this ========
        setTitle("Phone App - Stage 2");
        Container contentPane = getContentPane();

        //---- titleLabel ----
        titleLabel.setText("Phone App");
        titleLabel.setFont(titleLabel.getFont().deriveFont(titleLabel.getFont().getSize() + 9f));

        //---- preferredBrandLabel ----
        preferredBrandLabel.setText("Do you have a preferred brand?");
        preferredBrandLabel.setFont(preferredBrandLabel.getFont().deriveFont(preferredBrandLabel.getFont().getSize() + 3f));

        //---- preferredBrand ----
        preferredBrand.addItem("Choose an item");
        preferredBrand.addItem("Huawei");
        preferredBrand.addItem("LG");
        preferredBrand.addItem("Apple");
        preferredBrand.addItem("Nokia");
        preferredBrand.addItem("Samsung");
        preferredBrand.addItem("Sony");
        preferredBrand.addItem("Xiaomi");
        preferredBrand.addItem("Google");
        preferredBrand.addItem("Blackberry");
        preferredBrand.addItem("Not Important");

        preferredBrand.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(preferredBrand.getSelectedIndex()==0 || displaySize.getSelectedIndex()==0) next.setEnabled(false);
                else next.setEnabled(true);
             }
         });

        //---- displaySizeLabel ----
        displaySizeLabel.setText("Do you have any preference regarding the display size?");
        displaySizeLabel.setFont(displaySizeLabel.getFont().deriveFont(displaySizeLabel.getFont().getSize() + 3f));

        //---- displaySize ----
        displaySize.addItem("Choose an option");
        displaySize.addItem("Bigger than 5\"");
        displaySize.addItem("Smaller than 5\"");
        displaySize.addItem("Not important");

        displaySize.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                if(preferredBrand.getSelectedIndex()==0 || displaySize.getSelectedIndex()==0) next.setEnabled(false);
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
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(titleLabel))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(preferredBrandLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(preferredBrand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(displaySizeLabel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(displaySize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(next)))
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titleLabel)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(preferredBrandLabel)
                        .addComponent(preferredBrand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(displaySizeLabel)
                        .addComponent(displaySize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(next)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel titleLabel;
    private JLabel preferredBrandLabel;
    private JComboBox preferredBrand;
    private JLabel displaySizeLabel;
    private JComboBox displaySize;
    private JButton next;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
