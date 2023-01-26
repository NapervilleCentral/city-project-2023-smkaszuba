import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class TiltedTower1 extends JComponent
{
    private Rectangle tower = new Rectangle(70,200,100,250);
    private Polygon roof = new Polygon(new int[] {50, 190, 120}, new int[] {200, 200, 100}, 3);
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(new Color(207, 185, 151));
        page.fill(tower);
        page.setColor(new Color(255, 87, 51));
        page.fill(roof);
        page.fillOval(85,220,70,70);
        page.setColor(Color.white);
        page.fillOval(90,225,60,60);
        page.setColor(Color.black);
        page.fillOval(115,250,10,10);
        page.fillRect(117,252,23,5);
        page.fillRect(117,252,5,28);
    }
    
    public Polygon getRoof()
    {
        return roof;
    }
    
    public Rectangle getTower()
    {
        return tower;
    }
}