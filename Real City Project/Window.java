import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Window extends JComponent implements Runnable
{
    private Color color;
    private int count;
    private boolean day = true;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(color);
        page.fillRect(260,350,50,50);
        page.fillRect(500,350,50,50);
        page.fillRect(850,350,75,75);
        page.fillRect(765,350,75,75);
        page.fillRect(680,350,75,75);
    }
    
    public void run()
    {
        while(true)
        {   
           if (day == true)
            {
                color = new Color(12, 20, 69);
            }
            else
            {
                color = Color.yellow;
            }
           
           if (count >= 1000)
           {
                count = 0;
                day = !day;
           }
            
           ++count;
           try
           {
               Thread.sleep(17);
           }
           catch (Exception e){}
        }
    }
}