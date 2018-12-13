package GUI;

import BusinessLogic.Phone;

import javax.swing.*;
import java.util.ArrayList;

public class ResultWindow {

    private JPanel resultView;
    private JLabel resultTxt;

    public ResultWindow(ArrayList<Phone> phones, float minPrice, float maxPrice){
        String outputText = createOutputText(phones, minPrice, maxPrice);
        resultTxt.setText(outputText);

        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this.resultView);

        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    private String createOutputText(ArrayList<Phone> phones, float minPrice, float maxPrice){
        String output = "<html>The suitable phones for you following to the brand and the price range are: <br/><br/>";

        //To check if no phone was chosen
        int count = 0;

        for (Phone phone : phones) {
            float price = phone.getPrice();
            if(price <= maxPrice && price >= minPrice){
                output = output + "The phone " + phone.getModel() + " price now is <b>" + price + " €</b><br/>";
                count++;
            }
        }

        if (count == 0)
            output = output + "Nothing!<br/><br/>";

        output += "<br/><br/><br/> We wish that you had good experience with this prototype <br/><br/> Stay tuned for the final product ^_^</html>";

        return output;
    }
}
