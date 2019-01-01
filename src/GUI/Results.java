/*
 * Created by JFormDesigner on Mon Dec 17 10:24:08 CET 2018
 */

package GUI;

import BusinessLogic.Phone;
import BusinessLogic.Phones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

public class Results extends JFrame {


    private void restartActionPerformed(ActionEvent e){

        new InputWindow().showWindow();
        this.setVisible(false);
    }

    public void showWindow(int min, int max, int age, String brand, int expStorage, int displaySize, int dualSim, int waterproof) {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        boolean temp;
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        scrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        restart.addActionListener(e -> restartActionPerformed(e));

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        for(int i=0; i<phones.size(); i++) {
            if(phones.get(i).getPrice()<min || phones.get(i).getPrice()>max) {
                phones.remove(i);
                i--;
            }
        }
        if(brand!="Any" && phones.size()>0) {
            for(int i=0; i<phones.size(); i++) {
                if(!phones.get(i).getBrand().toString().equals(brand)) {
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
                if(displaySize==1 && phones.get(i).getDisplaySize()<5.2) {
                    phones.remove(i);
                    i--;
                } else if(displaySize==2 && phones.get(i).getDisplaySize()>=5.2) {
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
            phonesFound.setText("<html><style type='text/css'>" +
                    "..tg  {border-collapse:collapse;border-spacing:0;} " +
                    ".tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;} " +
                    ".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;} " +
                    ".tg .tg-baqh{text-align:center;vertical-align:top}" +
                    "</style>");


            phonesFound.setText(phonesFound.getText() + "<center><table class='tg'>" );

            for(int i=0;i<phones.size();i++) {
                URL f = ClassLoader.getSystemResource(phones.get(i).getImage());
                phonesFound.setText(phonesFound.getText()+

                                "<tr> " +
                                "<th class= tg-baqh  colspan= 2 >" +
                                phones.get(i).getName() +
                                "</th>" +
                                "</tr>" +
                                "<tr>" +
//                        "<th class='tg-0lax'>" +
//                                "<img src='" + f.toString()+ "'></img>" +
//                        "</th>" +
                                "<th class='tg-0lax'>" +
                                "Price: "+phones.get(i).getPrice() +
                                "</th>" +
                                "</tr>"
                );
            }

            phonesFound.setText(phonesFound.getText() +
                    "</table></center>");



            phonesFound.setText(phonesFound.getText()+"</html>");
        }

    }

    public Results() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ayham
        Title = new JLabel();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        phonesFound = new JLabel();
        restart = new JButton();

        //======== this ========
        setTitle("Phone App - Results");
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Search Result");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 3f));

        //---- label6 ----
        label6.setText("Based on your search paramaters, these are the results:");

        //======== scrollPane1 ========
        {
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //---- phonesFound ----
            phonesFound.setText("text");
            phonesFound.setHorizontalAlignment(SwingConstants.CENTER);
            scrollPane1.setViewportView(phonesFound);
        }

        //---- restart ----
        restart.setText("Search again");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label6)
                                        .addComponent(Title))
                                .addContainerGap(409, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(597, Short.MAX_VALUE)
                                .addComponent(restart)
                                .addGap(43, 43, 43))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Title)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label6)
                                .addGap(32, 32, 32)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(restart)
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ayham
    private JLabel Title;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JLabel phonesFound;
    private JButton restart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
