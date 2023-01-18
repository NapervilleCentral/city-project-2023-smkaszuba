import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class SunMoon extends JComponent implements Runnable
{
    private double theta;
    private boolean day = true;
    private Color planetColor;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {           
        page.fillRect(0,0,1920,1080);
        page.setColor(planetColor);
        page.fillOval((int)(350 * Math.sin(theta)) + 370, (int)(200 * Math.cos(theta)) + 210, 50, 50);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // invoke the draw method
        // ...
        draw(g2);


    }
    
    public void run()
    {
        while(true)
        {
            if (day == true)
            {
                planetColor = Color.yellow;
            }
            else
            {
                planetColor = Color.white;
            }
        
            if (theta - 2 * Math.PI > .01)
            {
                theta = 0;
                day = !day;
            }
            
            theta += Math.PI/500;
            try
            {
                Thread.sleep(17);
            }
            catch (Exception e){}
        }
    }
    
    public boolean getDay()
    {
        return day;
    }
}