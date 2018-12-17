/*
 * Created by JFormDesigner on Mon Dec 17 10:24:08 CET 2018
 */

package GUI;

import BusinessLogic.Phone;
import BusinessLogic.Phones;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

public class ResultWindow extends JFrame {
    public void showWindow(int min, int max, int age, String brand, int expStorage, int displaySize, int dualSim, int waterproof) {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boolean temp;
        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        ArrayList<Phone> phones = new Phones().getPhones();

        for(int i=0; i<phones.size(); i++) {
            if(phones.get(i).getPrice()<min || phones.get(i).getPrice()>max) {
                phones.remove(i);
                i--;
            }
        }
        if(brand!="Any" && phones.size()>0) {
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).getBrand().toString()!=brand) {
                    phones.remove(i);
                    i--;
                }
            }
        }

        if(expStorage!=0 && phones.size()>0) {
            if(expStorage == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isExpandableStorage()!=temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }

        if(displaySize!=0 && phones.size()>0) {
            for(int i=0; i<phones.size(); i++) {
                if(displaySize==1 && phones.get(i).getScreenSize()<5.2) {
                    phones.remove(i);
                    i--;
                } else if(displaySize==2 && phones.get(i).getScreenSize()>=5.2) {
                    phones.remove(i);
                    i--;
                }
            }
        }

        if(dualSim!=0 && phones.size()>0) {
            if(dualSim == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isDualSim()!=temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }

        if(waterproof!=0 && phones.size()>0) {
            if(waterproof == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isWaterproof()!=temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }

        if(phones.size()==0) phonesFound.setText("<html>Nothing has been found unfortunately!<br>Please adjust your parameters and try again.</html>");
        else {
            phonesFound.setText("<html>");
            for(int i=0;i<phones.size();i++) {
                phonesFound.setText(phonesFound.getText()+phones.get(i).getModel()+" Price: "+phones.get(i).getPrice()+"<br>");
            }
            phonesFound.setText(phonesFound.getText()+"</html>");
        }

    }

    public ResultWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        Title = new JLabel();
        label6 = new JLabel();
        phonesFound = new JLabel();

        //======== this ========
        setTitle("Phone App - Results");
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Search Result");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 3f));

        //---- label6 ----
        label6.setText("Based on your search paramaters, these are the results:");

        //---- phonesFound ----
        phonesFound.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label6)
                        .addComponent(Title))
                    .addContainerGap(229, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(phonesFound, GroupLayout.PREFERRED_SIZE, 478, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Title)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label6)
                    .addGap(29, 29, 29)
                    .addComponent(phonesFound, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel Title;
    private JLabel label6;
    private JLabel phonesFound;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
