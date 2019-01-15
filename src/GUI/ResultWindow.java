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

import static java.lang.Math.min;

public class ResultWindow extends JFrame {

    public ArrayList<Phone> phones = new ArrayList<>(new Phones().getPhones());
    public int current = 0;

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

    public static void quickSort(ArrayList<Phone> arr, int start, int end){

        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(ArrayList<Phone> arr, int start, int end){
        Phone pivot = arr.get(end);

        for(int i=start; i<end; i++){
            if(arr.get(i).getPrice()>pivot.getPrice()){
                Phone temp= arr.get(start);
                arr.set(start,arr.get(i));
                arr.set(i,temp);
                start++;
            }
        }

        Phone temp = arr.get(start);
        arr.set(start,pivot);
        arr.set(end,temp);

        return start;
    }

    public int minim(int a, int b) {
        if (a<b) return a;
        return b;
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

            previous.setEnabled(false);
            next.setEnabled(false);

            label6.setVisible(false);
            min.setVisible(false);
            max.setVisible(false);
            info.setVisible(false);
            slash.setText("NONE");
            specs.setText("<HTML>Unfortunately we were not able to find any phone" +
                    "that would meet your seach paramaters. Search again and adjust " +
                    "your parameters.");

            Point location = specs.getLocation();
            specs.setLocation(location.x, location.y+20);

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

            min.setText(Integer.toString(i+1));
            if(phones.size()>5) max.setText(Integer.toString(5));
            else max.setText(Integer.toString(phones.size()));

            if(phones.size()>5) label6.setText("Based on your search paramaters, these are the best 5 phones you can buy for the money:");
            else label6.setText("Based on your search paramaters, these are the best " + phones.size() + " phones you can buy for the money:");

            current = i;
            if(i>0) previous.setEnabled(true);
            else previous.setEnabled(false);

            if(i< minim(5,phones.size())-1) next.setEnabled(true);
            else next.setEnabled(false);

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

            if(phones.get(i).isFingerprint() == true) info.setText(info.getText()+"Yes" + "<br>" + "Fingerprint location: " + phones.get(i).getFingerprintLocation());
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
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

        if(phones.size()>0) quickSort(phones,0,phones.size()-1);
        setPhoneImage(0);
    }

    public ResultWindow() {
        initComponents();
    }

    private void previousActionPerformed(ActionEvent e) {
        // TODO add your code here

        setPhoneImage(current-1);

    }

    private void nextActionPerformed(ActionEvent e) {
        // TODO add your code here

        setPhoneImage(current+1);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Name
        Title = new JLabel();
        label6 = new JLabel();
        restart = new JButton();
        phoneImage = new JLabel();
        specs = new JLabel();
        previous = new JButton();
        next = new JButton();
        info = new JLabel();
        min = new JLabel();
        slash = new JLabel();
        max = new JLabel();

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

        //---- previous ----
        previous.setText("Previous");
        previous.addActionListener(e -> previousActionPerformed(e));
        previous.setEnabled(false);

        //---- next ----
        next.setText("Next");
        next.addActionListener(e -> nextActionPerformed(e));

        //---- info ----
        info.setText("text");

        //---- min ----
        min.setText("0");
        min.setFont(min.getFont().deriveFont(min.getFont().getSize() + 12f));

        //---- slash ----
        slash.setText("/");
        slash.setFont(slash.getFont().deriveFont(slash.getFont().getSize() + 12f));

        //---- max ----
        max.setText("5");
        max.setFont(max.getFont().deriveFont(max.getFont().getSize() + 12f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(Title)
                                .addComponent(label6))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(phoneImage, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(specs, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(info, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(previous)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(next)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(min)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(slash, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(5, 5, 5)
                                    .addComponent(max)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                                    .addComponent(restart)))
                            .addGap(15, 15, 15))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(Title)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(specs, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(info, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
                                    .addGap(141, 141, 141))
                                .addComponent(phoneImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(previous)
                                .addComponent(next)
                                .addComponent(restart)))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap(670, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(min)
                                .addComponent(max)
                                .addComponent(slash))))
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
    private JButton restart;
    private JLabel phoneImage;
    private JLabel specs;
    private JButton previous;
    private JButton next;
    private JLabel info;
    private JLabel min;
    private JLabel slash;
    private JLabel max;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
