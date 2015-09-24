

/**
 * A car has a certain fule efficiency and a certain amount of fuel in the gas tank. 
 *       The car can be driven a certain distance. 
 * @author (Tracey Gschwendtner ) 
 * @version (9/10/15)
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon */
    private double fuelEfficiency;

    /** amount of fuel in the cars tank in gallons */
    private double fuelInTank;
    /**
     * Constuctor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount
     *      of fuel in the tank.
     *      
     *
     * @pre        specified distance cannot result in the consumption of more gas
     *                  than is availabile
     *            
     * 
     * @param    distance       distance that the care drives in miles
     * 
     */
    public void drive(double distance)
    {
        this.fuelInTank -= distance / fuelEfficiency;
    }


    /**
     * Returns the amount of gas in teh car's tank in units of gallons
     *
     * @return the amount of gas in teh car's tank in units of gallons
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }


    /**
     * Increments the fuel in the car's tank by the specified amount in ga
     *
     * @pre     gallonsOfGas must be a postive number
     * @param   gallonsOfGas    amount of gas to add to the car's tank in gallons
     */
    public void addGas(double gallonsOfGas)
    {
        this.fuelInTank += gallonsOfGas;
    }

}
