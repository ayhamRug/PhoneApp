/*
 * Created by JFormDesigner on Mon Dec 17 10:24:08 CET 2018
 */

package GUI;

import BusinessLogic.Phone;
import BusinessLogic.Phones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

public class ResultWindow extends JFrame {


    private void restartActionPerformed(ActionEvent e){

        new BudgetWindow().showWindow();
        this.setVisible(false);
    }

    private void priceFilter(ArrayList<Phone> phones, int budget) {
        for(int i=0; i<phones.size(); i++) {
            if(phones.get(i).getPrice()>budget) {
                phones.remove(i);
                i--;
            }
        }
    }

    private void expandableStorageFilter(ArrayList<Phone> phones, int expStorage) {
        boolean temp;
        if(expStorage!=3 && phones.size()>0) {
            if(expStorage == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isExpandableStorage()!=temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void dualSimFilter(ArrayList<Phone> phones, int dualSim) {
        boolean temp;
        if(dualSim!=3 && phones.size()>0) {
            if(dualSim == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isDualSim()!=temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void kindOfPhoneStage1Filter(ArrayList<Phone> phones, int kindOfPhone) {
        boolean temp;
        if(kindOfPhone!=3 && phones.size()>0) {
            if(kindOfPhone == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isTouchscreen()!= temp || phones.get(i).isKeyboard() == temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void kindOfPhoneStage1Filter2(ArrayList<Phone> phones, int kindOfPhone) {
        if(kindOfPhone!=4 && phones.size()>0) {
            if(kindOfPhone == 1) {
                for(int i=0; i<phones.size();i++) {
                    if(phones.get(i).isTouchscreen() != true || phones.get(i).isKeyboard() == true) {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if(kindOfPhone == 2) {
                for(int i=0; i<phones.size();i++) {
                    if(phones.get(i).isTouchscreen() != false || phones.get(i).isKeyboard() == false) {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if(kindOfPhone == 3) {
                for(int i=0; i<phones.size();i++) {
                    if(phones.get(i).isTouchscreen() != true || phones.get(i).isKeyboard() != true) {
                        phones.remove(i);
                        i--;
                    }
                }
            }
        }
    }

    private void preferredBrandFilter(ArrayList<Phone> phones, int preferredBrand) {
        String brand = "";
        if(preferredBrand == 1) brand = "Huawei";
        else if(preferredBrand == 2) brand = "LG";
        else if(preferredBrand == 3) brand = "Apple";
        else if(preferredBrand == 4) brand = "Nokia";
        else if(preferredBrand == 5) brand = "Samsung";
        else if(preferredBrand == 6) brand = "Sony";
        else if(preferredBrand == 7) brand = "Xiaomi";
        else if(preferredBrand == 8) brand = "Google";
        else if(preferredBrand == 9) brand = "Blackberry";

        if(preferredBrand != 10 && phones.size()>0) {
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).getBrand() != brand) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void displaySizeFilter(ArrayList<Phone> phones, int displaySize) {
        if(displaySize!=3 && phones.size()>0) {
            if(displaySize == 1) {
                for(int i=0; i<phones.size(); i++) {
                    if (phones.get(i).getDisplaySize() < 5) {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if(displaySize == 2) {
                for(int i=0; i<phones.size(); i++) {
                    if (phones.get(i).getDisplaySize() > 5) {
                        phones.remove(i);
                        i--;
                    }
                }
            }
        }
    }

    private void waterproofFilter(ArrayList<Phone> phones, int waterproof) {
        boolean temp;
        if(waterproof!=3 && phones.size()>0) {
            if(waterproof == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isWaterproof()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void rearCamerasFilter(ArrayList<Phone> phones, int rearCameras) {
        boolean temp;
        if(rearCameras!=3 && phones.size()>0) {
            if(rearCameras == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isMultipleCameras()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void fingerprintFilter(ArrayList<Phone> phones, int fingerprint) {
        boolean temp;
        if(fingerprint!=3 && phones.size()>0) {
            if(fingerprint == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isFingerprint()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void fingerprintLocationFilter(ArrayList<Phone> phones, int fingerprintLocation) {
        if(fingerprintLocation!=5 && phones.size()>0) {
            if(fingerprintLocation == 1) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getFingerprintLocation() != "rear") {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if (fingerprintLocation == 2) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getFingerprintLocation() != "front") {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if (fingerprintLocation == 3) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getFingerprintLocation() != "side") {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if (fingerprintLocation == 4) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getFingerprintLocation() != "underDisplay") {
                        phones.remove(i);
                        i--;
                    }
                }
            }
        }
    }

    private void rearCameraNumberFilter(ArrayList<Phone> phones, int rearCameraNumber) {
        int temp = rearCameraNumber+1;
        if (rearCameraNumber != 4 && phones.size()>0) {
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).getNumberOfCameras() != temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void faceRecognitionFilter(ArrayList<Phone> phones,int faceRecognition) {
        boolean temp;
        if(faceRecognition!=3 && phones.size()>0) {
            if(faceRecognition == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isFaceRecognition()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void headphoneJackFilter(ArrayList<Phone> phones,int headphoneJack) {
        boolean temp;
        if(headphoneJack!=3 && phones.size()>0) {
            if(headphoneJack == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isHeadphoneJack()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void penFilter(ArrayList<Phone> phones,int pen) {
        boolean temp;
        if(pen!=3 && phones.size()>0) {
            if(pen == 1) temp = true;
            else temp = false;
            for(int i=0; i<phones.size(); i++) {
                if(phones.get(i).isPen()!= temp) {
                    phones.remove(i);
                    i--;
                }
            }
        }
    }

    private void connectorFilter(ArrayList<Phone> phones, int connector) {
        if (connector != 4 && phones.size()>0) {
            if(connector == 1) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getConnectorType()!= "microUSB") {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if (connector == 2) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getConnectorType()!= "typeC") {
                        phones.remove(i);
                        i--;
                    }
                }
            } else if (connector == 3) {
                for(int i=0; i<phones.size(); i++) {
                    if(phones.get(i).getConnectorType()!= "lightning") {
                        phones.remove(i);
                        i--;
                    }
                }
            }
        }
    }

    private void printInfo(ArrayList<Phone> phones) {
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

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        scrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        restart.addActionListener(e -> restartActionPerformed(e));
    }

    public void showWindowStage1(int budget, int kindOfPhone, int expStorage, int dualSim) {

        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter(phones,kindOfPhone);

        printInfo(phones);

    }

    public void showWindowStage2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);

        printInfo(phones);
    }

    public void showWindowStage3_1(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);

        printInfo(phones);
    }

    public void showWindowStage3_2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);

        printInfo(phones);
    }

    public void showWindowStage4_1(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int fingerprintLocation, int rearCameraNumber) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);
        fingerprintLocationFilter(phones,fingerprintLocation);
        rearCameraNumberFilter(phones,rearCameraNumber);

        printInfo(phones);
    }

    public void showWindowStage4_2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int fingerprintLocation) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);
        fingerprintLocationFilter(phones,fingerprintLocation);

        printInfo(phones);
    }

    public void showWindowStage4_3(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int rearCameraNumber) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);
        rearCameraNumberFilter(phones,rearCameraNumber);

        printInfo(phones);
    }

    public void showWindowStage5(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int fingerprint, int rearCameras, int waterproof, int rearCameraNumber, int fingerprintLocation, int faceRecognition, int pen, int connector, int headphoneJack) {
        init();

        ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);
        fingerprintLocationFilter(phones,fingerprintLocation);
        rearCameraNumberFilter(phones,rearCameraNumber);
        faceRecognitionFilter(phones,faceRecognition);
        penFilter(phones,pen);
        headphoneJackFilter(phones,headphoneJack);
        connectorFilter(phones,connector);

        printInfo(phones);
    }

    public ResultWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
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
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel Title;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JLabel phonesFound;
    private JButton restart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
