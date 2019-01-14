/*
 * Created by JFormDesigner on Mon Dec 17 10:24:08 CET 2018
 */

package GUI;

import BusinessLogic.Phone;
import BusinessLogic.Phones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ResultWindow extends JFrame {

    public ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());

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

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);

        restart.addActionListener(e -> restartActionPerformed(e));
    }

    public void setPhoneImage(int i) {
        if(phones.size()==0) {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(".\\phoneImages\\na.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Image dimg = img.getScaledInstance(phoneImage.getWidth(), phoneImage.getHeight(),
                    Image.SCALE_SMOOTH);

            ImageIcon imageIcon = new ImageIcon(dimg);

            phoneImage.setIcon(imageIcon);
        } else {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(phones.get(i).getImage()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Image dimg = img.getScaledInstance(phoneImage.getWidth(), phoneImage.getHeight(),
                    Image.SCALE_SMOOTH);

            ImageIcon imageIcon = new ImageIcon(dimg);

            phoneImage.setIcon(imageIcon);

            info.setText("<html>Name: " + phones.get(i).getName() + "<br>" +
                    "Price: " + phones.get(i).getPrice() + "<br>" +
                    "Touchscreen: ");

            if(phones.get(i).isTouchscreen() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Dual Sim: ");

            if(phones.get(i).isDualSim() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Expandable Storage: ");

            if(phones.get(i).isExpandableStorage() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Brand: " + phones.get(i).getBrand() + "<br>" + "Keyboard: ");

            if(phones.get(i).isKeyboard() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Display size: " + phones.get(i).getDisplaySize() + "<br>" + "Waterproof: ");

            if(phones.get(i).isWaterproof() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Multiple cameras: ");

            if(phones.get(i).isMultipleCameras() == true) info.setText(info.getText()+"Yes"+ "<br>" + "Number of rear cameras: " + phones.get(i).getNumberOfCameras());
            else info.setText(info.getText()+"No"+ "<br>" + "Number of rear cameras: " + phones.get(i).getNumberOfCameras());

            info.setText(info.getText()+"<br>" + "Fingerprint: ");

            if(phones.get(i).isFingerprint() == true) info.setText(info.getText()+"Yes" + "<br>" + "Fingerprint location: " + phones.get(i).getFingerprintLocation() + "<br>");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Connector Type: " + phones.get(i).getConnectorType());

            info.setText(info.getText()+"<br>" + "Headphone jack: ");

            if(phones.get(i).isHeadphoneJack() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Pen/Stylus: ");

            if(phones.get(i).isPen() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"<br>" + "Face recognition capability: ");

            if(phones.get(i).isFaceRecognition() == true) info.setText(info.getText()+"Yes");
            else info.setText(info.getText()+"No");

            info.setText(info.getText()+"</html>");
        }


    }

    public void showWindowStage1(int budget, int kindOfPhone, int expStorage, int dualSim) {

        init();

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter(phones,kindOfPhone);

        setPhoneImage(0);
    }

    public void showWindowStage2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize) {
        init();

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);

        setPhoneImage(0);
    }

    public void showWindowStage3_1(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize) {
        init();

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);

        setPhoneImage(0);
    }

    public void showWindowStage3_2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint) {
        init();

        priceFilter(phones,budget);
        expandableStorageFilter(phones,expStorage);
        dualSimFilter(phones,dualSim);
        kindOfPhoneStage1Filter2(phones,kindOfPhone);
        preferredBrandFilter(phones,preferredBrand);
        displaySizeFilter(phones,displaySize);
        waterproofFilter(phones,waterproof);
        rearCamerasFilter(phones,rearCameras);
        fingerprintFilter(phones,fingerprint);

        setPhoneImage(0);
    }

    public void showWindowStage4_1(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int fingerprintLocation, int rearCameraNumber) {
        init();

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

        setPhoneImage(0);

    }

    public void showWindowStage4_2(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int fingerprintLocation) {
        init();

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

        setPhoneImage(0);

    }

    public void showWindowStage4_3(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int waterproof, int rearCameras, int fingerprint, int rearCameraNumber) {
        init();

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

        setPhoneImage(0);
    }

    public void showWindowStage5(int budget, int kindOfPhone, int expStorage, int dualSim, int preferredBrand, int displaySize, int fingerprint, int rearCameras, int waterproof, int rearCameraNumber, int fingerprintLocation, int faceRecognition, int pen, int connector, int headphoneJack) {
        init();

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

        setPhoneImage(0);
    }

    public ResultWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        Title = new JLabel();
        label6 = new JLabel();
        restart = new JButton();
        phoneImage = new JLabel();
        specs = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        info = new JLabel();

        //======== this ========
        setTitle("Phone App - Results");
        Container contentPane = getContentPane();

        //---- Title ----
        Title.setText("Search Results");
        Title.setFont(Title.getFont().deriveFont(Title.getFont().getSize() + 9f));

        //---- label6 ----
        label6.setText("Based on your search paramaters, these are the best phones you can buy for the money:");

        //---- restart ----
        restart.setText("Search again");

        //---- phoneImage ----
        if(phones.size()==0) {
            phoneImage.setIcon(new ImageIcon(".\\phoneImages\\na.png"));
        }

        //---- specs ----
        specs.setText("Specifications:");
        specs.setFont(specs.getFont().deriveFont(specs.getFont().getSize() + 3f));

        //---- button1 ----
        button1.setText("Previous");

        //---- button2 ----
        button2.setText("Next");

        //---- info ----
        info.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restart)
                            .addGap(15, 15, 15))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(Title)
                                .addComponent(label6))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(phoneImage, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(specs, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
                                .addComponent(info))
                            .addGap(57, 57, 57))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(Title)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(phoneImage, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(restart)
                                .addComponent(button1)
                                .addComponent(button2))
                            .addGap(16, 16, 16))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(specs, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(info)
                            .addContainerGap(530, Short.MAX_VALUE))))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Name
    private JLabel Title;
    private JLabel label6;
    private JButton restart;
    private JLabel phoneImage;
    private JLabel specs;
    private JButton button1;
    private JButton button2;
    private JLabel info;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
