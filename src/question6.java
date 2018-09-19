import java.util.Scanner;

public class question6 {
    public static void main(String args[])
    {

        float euro,pound,rate, exRate, convert;

        Scanner input = new Scanner(System.in);

        exRate = getExchangeRate();
        System.out.printf("Exchange rate 1 euro is %.2f GBP", exRate);

        euro = getAmountInEuro();
        System.out.printf("%.2f", euro);
        convert = getConversion(exRate, euro);

        System.out.printf("%.2f euro is %.2f GBP", euro, convert);
                //" + (String.format("%.2f", convert)));
    }

    public static float getExchangeRate()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exchange rate in euro for £: ");
        float r = input.nextFloat();

        return r;
    }

    public static float getAmountInEuro( )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount of euro you wish to convert: ");
        float e = input.nextFloat();

        return e;

    }

    public static float getConversion(float exR, float euro)
    {

        float gpb = (euro * exR);
        System.out.printf("%.2f", gpb);

        return gpb;





    }

    }
