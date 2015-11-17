import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.Color;


/**
 * Write a description of class Building here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (10/11/15)
 */
public class River
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int inwidth;
    private int inheight;
    private String Type;
    /**
     * Default constructor for objects of class Building
     */
    public River(int x, int y, int width, int height, String Type )
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
        this.inwidth = width;
        this.inheight = height;
        this.Type = Type;
    }

    /**
     * An example of a method - Draws a Building
     *

     * @post    instantiates a Building object
     * 
     * @param    g2    Graphics Object
     * 
     */
    public void draw(Graphics2D g2)
    {// put your code here
        Rectangle River = new Rectangle(xLeft,yTop, inwidth, inheight);
        g2.setColor(Color.BLUE);
        g2.fill(River);
        if (Type.equals ("Road"))
        {
            g2.setColor(Color.BLACK);
            g2.fill(River);
        }
        if (Type.equals ("road"))
        {
            g2.setColor(Color.BLACK);
            g2.fill(River);
        }
        g2.draw(River);
        



    }

}