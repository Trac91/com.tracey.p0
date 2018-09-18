import javax.swing.*;

public class question3 {


    public static void main(String args[]) {
        // Declare Variables

        String name, taxableIncomeAsString;
        float taxableIncome, taxDue=0, netIncome, taxRate;

        // Prompt user for input

        name = JOptionPane.showInputDialog("Enter Name: ");

        taxableIncomeAsString = JOptionPane.showInputDialog("Taxable Income: ");

        // Parse String to a float
        taxableIncome = Float.parseFloat(taxableIncomeAsString);

        // User Defined method to establish tax rate
        taxRate = getTaxRate(taxableIncome);

        // User Defined method to calculate tax due
        taxDue = getTaxDue(taxableIncome,taxRate,taxDue);

        // User Defined method to calculate gross

        netIncome = getNetIncome(taxDue,taxableIncome);

        // Display Message Box
        JOptionPane.showMessageDialog(null, "Taxable Income: " + taxableIncome + "\nName: " + name + "\nTax Rate: " + taxRate + "\nTax due: "+ taxDue +
                "\nNet Income: " + netIncome,"Information",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
        // User defined method to establish the rate of tax to be used in calculations
    	
    	public static float getTaxRate(float Income) {
        
        float Rate;
        
        if (Income <= 20000.00);
        {
            Rate = 0;
        }

        if((Income > 20000.00) || (Income <= 36000.00))
            {
                Rate = 20;

            }

        else
            {
                Rate = 41;

            }
		return Rate;
    }
    
    public static float getTaxDue(float tax, float Rate, float taxableIncome) {


        if (Rate==0)
        {
            tax = ((taxableIncome/100)*0f);
        }
        else if (Rate==20)
        {
            tax = ((taxableIncome/100)*20f);
        }
        else
        {
            tax = ((taxableIncome/100)*41f);
        }

        return tax;



    }

    public static float getNetIncome(float tax, float Income){


      Income = (Income-tax);

        return Income;
    }



    

}
