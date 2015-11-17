import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.Color;
public class Sun
{
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    public Sun(int x, int y, int w, int h )
    {
        xLeft = x;
        yTop = y;
        width = w;
        height = h;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft , yTop, width, height);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
    
    public void move()
    {
        xLeft -= 10;
        
    }
}