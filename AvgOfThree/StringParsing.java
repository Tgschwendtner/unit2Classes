import java.util.Scanner;
// E4.11
public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String x;
        System.out.print("Please enter a number 1,000 and 999,999: ");
        x = s.next();
        int length = x.length();
        System.out.println(length);
        String subx1 = x.substring(0,length-4);
        String subx2 = x.substring(length-3);
        System.out.println(subx1+subx2);
    }
}
        