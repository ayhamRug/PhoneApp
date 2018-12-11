package GUI;

import javax.swing.*;
import java.util.ArrayList;

public class Result {

    private JPanel resultView;
    private JLabel resultTxt;

    public Result(ArrayList<String[]> x, int min, int max) {
        String res = "<html>The suitable phones for you following to the brand and the price range are: <br/><br/>";

        //To check if no phone was chosen
        int count = 0;

        for (int i = 0; i< x.size();i++){
            //Choosing only phones with the chosen brand
            if(Integer.parseInt(x.get(i)[1]) <= max && Integer.parseInt(x.get(i)[1]) >= min){
                res = res + "The phone " +  x.get(i)[0] + " price now is <b>" + x.get(i)[1]+ " €</b><br/>";
                count++;
            }

        }

        if (count == 0)
            res = res + "Nothing!<br/><br/>";

        res = res + "<br/><br/><br/> We wish that you had good experience with this prototype <br/><br/> Stay tuned for the final product ^_^</html>";

        resultTxt.setText(res);

        JFrame frame = new JFrame("Phone App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this.resultView);

        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
