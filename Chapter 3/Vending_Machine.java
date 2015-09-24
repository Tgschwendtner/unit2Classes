

/**
 * Write a description of class Vending_Machine2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending_Machine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int Cans;
    private int Tokens;

    /**
     * Default constructor for objects of class Vending_Machine2
     */
    public Vending_Machine(int starting_soda)
    {
        // initialise instance variables
        this.Cans = starting_soda ;
        this.Tokens = 0;
    }
    
    /**
     * Default constructor for objects of class Vending_Machine2
     */
    public Vending_Machine()
    {
        // initialise instance variables
        this.Cans = 10 ;
        this.Tokens = 0;
    }
    
    /**
     * Fills up Vending Machine with cans
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     */
    public void fillUp(int numberOfCans)
    {
        // put your code here
        this.Cans += numberOfCans;
    }

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
    public int insertToken(int tokensInserted)
    {
        // put your code here
        this.Tokens += tokensInserted;
        this.Cans -= tokensInserted;
        return Tokens + Cans;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getCanCount()
    {
        // put your code here
        return this.Cans;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokenCount()
    {
        // put your code here
        return this.Tokens;
    }

}
