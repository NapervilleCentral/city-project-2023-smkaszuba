import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Sky extends JComponent
{
    private double theta;
    private boolean day = true;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawSky(Graphics2D page)
    {   
        if (day == true)
        {
            page.setColor(Color.cyan);
            page.fillRect(0,0,1920,1080);
            page.setColor(Color.yellow);
        }
        else
        {
            page.setColor(new Color(4, 26, 44));
            page.fillRect(0,0,1920,1080);
            page.setColor(Color.white);
        }
        
        page.fillOval((int)(350 * Math.sin(theta)) + 370, (int)(200 * Math.cos(theta)) + 210, 50, 50);
        
        if (theta - 2 * Math.PI > .01)
        {
            theta = 0;
            day = !day;
        }
        
        theta += Math.PI/300;
    }
    
    public boolean getDay()
    {
        return day;
    }
}