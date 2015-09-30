import java.lang.Math;
import java.text.NumberFormat;

/**
 * Write a description of class Annuity here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (9/29)
 */
public class Annuity
{
    /** description of instance variable x (add comment for each instance variable) */
    private static double PMT = 10000;
    private static double i = .08;
    private static double n = 20;

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        // double periodicPayment, double periodicInterest, int numPay
        double base = i + 1;
        double exponent = n - 1;
        double power = Math.pow( base, exponent);
        double top = (power - 1)/ i;
        double fraction = top/ power;
        double parenthesis = fraction + 1;
        double total = parenthesis*PMT;
        NumberFormat formater = NumberFormat.getCurrencyInstance();
        System.out.println(formater.format(total));
    }

}