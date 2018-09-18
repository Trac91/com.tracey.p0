import javax.swing.*;

public class question4 {
    public static void main(String[] args) {

        String numAsString;
        int number, i, count=0, total=0;


        // Prompt user for input

        numAsString = JOptionPane.showInputDialog("Please enter a number (+) (-) or (0)");

        while (!numAsString.equals("q"))
        {
            // convert String to an Integer


            for(i=0;i<numAsString.length();i++)
            {
                number = Integer.parseInt(numAsString);

                count++;

                total += count;

                numAsString = JOptionPane.showInputDialog("Please re-enter a number (+) (-)  or (0)");



             }
             

        }
        JOptionPane.showMessageDialog(null,"Grand Total: " + total + "\nNo of Entries: " + count,"Number Checker",JOptionPane.INFORMATION_MESSAGE);


    }

}
