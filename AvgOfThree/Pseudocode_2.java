import java.util.Scanner;
import java.lang.Math;
//P4.8
public class Pseudocode_2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double due , received;
        System.out.print("Please enter the amount due: ");
        due = s.nextDouble();
        System.out.print("Please enter the amount received: ");
        received = s.nextDouble();
        
        
        
        double change =  (received - due)*100;
        change = (int) change;
        System.out.println(change);
        
        int dollars = (int) change/100;
        change = change%100;
        int quarters = (int) change/25;
        change = change%25;
        int dimes = (int) change/10;
        change = change%10;
        int nickels = (int) change/5;
        change = change%5;
        int pennies = (int) change/1;
        change = change%1;
        
               
        System.out.println("Your change is");
        System.out.println(dollars + " dollars");
        System.out.println(quarters+ " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
       
    }
}