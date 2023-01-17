import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Sky extends JComponent implements Runnable
{
    private double theta;
    private boolean day = true;
    private Color sky, planetColor;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawSky(Graphics2D page)
    {           
        page.setColor(sky);
        page.fillRect(0,0,1920,1080);
        page.setColor(planetColor);
        page.fillOval((int)(350 * Math.sin(theta)) + 370, (int)(200 * Math.cos(theta)) + 210, 50, 50);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        drawSky(g2);


    }
    
    public void run()
    {
        while(true)
        {
            if (day == true)
        {
            sky = Color.cyan;
            planetColor = Color.yellow;
        }
        else
        {
            sky = new Color(4, 26, 44);
            planetColor = Color.white;
        }
        
        if (theta - 2 * Math.PI > .01)
        {
            theta = 0;
            day = !day;
        }
        
        
        theta -= Math.PI/300;
        System.out.println(theta);
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