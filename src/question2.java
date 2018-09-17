import javax.swing.*;

public class question2 {
    public static void main(String[] args) {

        String fname, lname, initial, distanceAsString;
        double distance;


        // Prompt user for information


        fname = JOptionPane.showInputDialog("First Name");

        lname = JOptionPane.showInputDialog("Second name");

        initial = JOptionPane.showInputDialog("Initial");

        distanceAsString = JOptionPane.showInputDialog("Distance Cycled");

        // Convert distance to integer

        distance = Double.parseDouble(distanceAsString);


        JOptionPane.showMessageDialog(null, "First Name: " + fname + "\nLast Name :" + lname + "\nInitial :" + initial +
                "\n" + "Distance Cycled: " + distance + "\nMoney Raised: €" + getTotalRaised(distance), "Sponcered Cyclist", JOptionPane.INFORMATION_MESSAGE);


    }

    // User defined method to calculate money raised

    public static double getTotalRaised(double distance) {

        final double HIGH_RATE = 0.10;
        final double LOW_RATE = 0.07;
        double total = 0;

        if (distance <= 10) {
            total = distance * LOW_RATE;
        }


        if (distance > 10) {
            total = ((distance * HIGH_RATE) - 1) + .7;

        }
        return total;
    }

}


