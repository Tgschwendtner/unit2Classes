/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private boolean facing;
    private String state;
    private String name;
    /**
     * Default constructor for objects of class Door
     */
    public Door(String givenName, String initialState )
    {
        // initialise instance variables
        this.state = initialState;
        this.name = givenName;
        this.facing = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (The state of the door is not open when this method is called)
     * @post    postconditions for the method
     *            (The Door object will have an "open" state)
     * @param    initialState   The parameter gives the variable that we have to change
     * @return    the return value is proof that this method has executed
     */
    public String open(String initialState)
    {
        // put your code here
        initialState = "open";
        return "The door object has been opened";
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (The state of the door is not closed when this method is called)
     * @post    postconditions for the method
     *          (The Door object will have a "close" state)
     * @param   initialState   The parameter gives the variable that we have to change
     * @return  the return value is prrof that this method has executed
     */
    public String close(String initialState)
    {
        // put your code here
        initialState = "close";
        return "The door object has been closed";
    }



    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (The door object that the method is called on has been given a name)
     * @post    postconditions for the method
     *          (Will return the name of the door object)
     * @return  returns the name of the Door object it was called on
     */
    public String getName()
    {
        // put your code here
        return this.name;
    }
    


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (the door object has been created)
     * @post    postconditions for the method
     *          (Will return the state of the door object)
     * @return  returns the state of the door object
     */
    public String getState()
    {
        // put your code here
        return this.state;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post    postconditions for the method
     *          (name of the object is changed to the string given to the parameter)
     * @param   y   new name
     */
    public void setName(String newName)
    {
    this.name = newName;
}
}