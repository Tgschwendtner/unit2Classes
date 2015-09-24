import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Car2 car1 = new Car2( 0, 0 );
        
        int x = getWidth() - 60;
        int y = getHeight() - 60;
        
        Car2 car2 = new Car2( x , y );
        
        car1.draw(g2);
        car2.draw(g2);
    }
}
