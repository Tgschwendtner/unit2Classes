import java.util.Scanner;
//P4.6
public class Pseudocode_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String phone_number;
        System.out.print("Please enter a phone number: ");
        phone_number = s.next();
        System.out.println(phone_number);
        int length = phone_number.length();
        System.out.println(length);
    }
}
    