import java.util.Scanner;
import java.lang.Math;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double paid = 0.0;
        double cost = 0.0;
        double change = 0.0;
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        
        System.out.println("Please Enter the Amount Paid:");
        paid = scan.nextDouble();
        System.out.println(paid);
        System.out.println("Please Enter the Cost of the Item:");
        cost = scan.nextDouble();
        System.out.println(paid);
        change = (paid - cost) * 100;
        change = Math.round(change);
        change = change/100;
        System.out.println("Change Owed: " + change);
        double changePennies = (double)(change - (change % 0.1));
        pennies = (int)((change - changePennies) * 100);
        System.out.println(changePennies);
        System.out.println(pennies);
        
       
        
    }
}