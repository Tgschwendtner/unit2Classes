import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private String type;
    Sun sun = new Sun(700, 25, 20, 20);
   
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent( String Type)
    {
        this.type = Type;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Building building1 = new Building(15,75, 100, 300);
        Building building2 = new Building(130, 75 , 100, 300);
        Building building3 = new Building(245, 75 , 100, 300);
        Building building4 = new Building(400, 75 , 100, 300);
        Building building5 = new Building(515, 75 , 100, 300);
        Building building6 = new Building(630, 75 , 100, 300);
        River river = new River ( 0, 400 , 800, 200, type);
        // invoke the draw method on each object in your Cityscape
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
		river.draw(g2);
        sun.draw(g2);
          }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sun.move();
       

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
