import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class TiltedTower2 extends JComponent
{
    private Rectangle roof1 = new Rectangle(240,270,100,180), roof2 = new Rectangle(270,325,200,125), roof3 = new Rectangle(470,270,100,180);
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(new Color(207, 185, 151));
        page.fillRect(240,270,100,180);
        page.fillRect(270,325,200,125);
        page.fillRect(470,270,100,180);
    }
    
    public Rectangle getRoof1()
    {
        return roof1;
    } 
    
    public Rectangle getRoof2()
    {
        return roof2;
    }
    
    public Rectangle getRoof3()
    {
        return roof3;
    } 
}