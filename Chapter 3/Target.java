import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Target
{
    private int xLeft;
    private int yTop;

    public Target (int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft + 25 , yTop + -25, 225 , 225);
       Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 50 , yTop + -50 , 200 , 200);
       Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft + 75 , yTop + -75, 175 , 175);
       Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft + 100 , yTop + -100, 150 , 150);
       Ellipse2D.Double ring5 = new Ellipse2D.Double(xLeft + 125 , yTop + -125, 125 , 125);
       
       g2.draw(ring1);
       g2.draw(ring2);
       g2.draw(ring3);
       g2.draw(ring4);
       g2.draw(ring5);
    }
}