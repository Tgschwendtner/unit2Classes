import java.util.Scanner;
import java.lang.Math;
//E4.8
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double x , y;
        System.out.print("Enter the rectangles 1st side ");
        x = s.nextDouble();
        System.out.print("Enter the rectangles 2nd side ");
        y = s.nextDouble();
        double area = x*y;
        System.out.println(area);
        double perimeter = area*2;
        System.out.println(perimeter);
        double c2 = Math.pow(x,2) + Math.pow(y,2);
        double c = Math.sqrt(c2);
        System.out.println(c);
    }
}
        