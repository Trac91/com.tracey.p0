import javax.swing.*;

public class question3 {
    public static void main(String args[]) {
        // Declare Variables

        String name, taxableIncomeAsString;
        float taxableIncome, taxDue, netIncome, gross, taxRate;


        // Prompt user for input

        name = JOptionPane.showInputDialog("Enter Name: ");

        taxableIncomeAsString = JOptionPane.showInputDialog("Taxable Income: ");

        // Parse String to a float

        taxableIncome = Float.parseFloat(taxableIncomeAsString);

        // User Defined method to establish tax rate
        taxRate = getTaxRate();

        // User Defined method to calculate tax due
        taxDue = getTaxDue();

        // User Defined method to calculate gross

        netIncome = getNetIncome();


        // Display Message Box
        JOptionPane.showMessageDialog(null, "Taxable Income",taxableIncome, "Name" + name, "Tax Rate", taxRate + "Tax due", taxDue, JOptionPane.INFORMATION_MESSAGE);


    }
        // User defined method to establish the rate of tax to be used in calculations
    	
    	public static float getTaxRate(float taxableIncome) {
        
        float taxRate,taxableIncome;
        
        if (taxableIncome <= 20000.00);
        {
            taxRate = 0;
        }

        else if
            (taxableIncome > 20000.00 || taxableIncome <= 36000.00);
        {
            taxRate = 20;
            
        }

        else
            {
                taxRate = 41;

            }
		return taxRate;
    }
    
    public static float getTaxDue(float taxDue, float taxRate, float taxableIncome) {

        float taxDue;

        if (taxRate==0);
        {
            taxDue = ((taxableIncome/100)*0);
        }
        else if (taxRate==20);
        {
            taxDue = ((taxableIncome/100)*20);
        }
        else
        {
            taxDue = ((taxableIncome/100)*40);
        }

        return taxDue;



    }

    public static float getNetIncome(float taxDue, float taxableIncome){

        float taxDue;
        float taxableIncome;

        netIncome = (taxableIncome-taxDue);

    }
     return netIncome;


    

}
//"\nTax Due: " + "\nGross Income: " + "\nTax Rate: ","Tax Calculations"