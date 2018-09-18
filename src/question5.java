import javax.swing.*;

public class question5 {
    public static void main(String args[])
    {
        String option="", choice, number1, number2;
        int num1=0, num2=0, answer;


        choice = JOptionPane.showInputDialog("Please enter an option 'A' for + 'S' for - 'M' for * 'D' for /");

        if((choice.equals("A") ||(choice.equals("S")|| (choice.equals("M")|| (choice.equals("A")))))) {

            number1 = JOptionPane.showInputDialog("Please enter a number");

            num1 = Integer.parseInt(number1);

            number2 = JOptionPane.showInputDialog("Please enter another number");

            num2 = Integer.parseInt(number2);

            switch (choice) {
                case "A":
                    answer = (num1 + num2);
                    JOptionPane.showMessageDialog(null, "Calculation is " + answer);
                    break;
                case "S":
                    answer = (num1 - num2);
                    JOptionPane.showMessageDialog(null, "Calculation is " + answer);
                    break;
                case "M":
                    answer = (num1 * num2);
                    JOptionPane.showMessageDialog(null, "Calculation is " + answer);
                    break;
                case "D":
                    answer = (num1 / num2);
                    JOptionPane.showMessageDialog(null, "Calculation is " + answer);
                    break;
                default:
                    //JOptionPane.showInputDialog("Please re-enter an option 'A' for + 'S' for - 'M' for * 'D' for /");
                    break;


            }

        }
        else
            {
                JOptionPane.showMessageDialog(null,"Incorrect Option Program Closing","Error Message",JOptionPane.INFORMATION_MESSAGE);
            }

















    }
}
