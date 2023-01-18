import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Sky extends JComponent implements Runnable
{
    private Color color = Color.cyan;
    private double red = 0, green = 255, blue = 255;
    private int count;
    private boolean day = true;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(new Color((int)red, (int)green, (int)blue));
        page.fillRect(0,0,1920,1080);
    }
    
    public void run()
    {
        while(true)
        {   
           if (count >= 750){
               if (day == true)
               {
                    red += .016;
                    green -= .916;
                    blue -= .844;
               }
               else 
               {
                    red -= .016;
                    green += .916;
                    blue += .844; 
               }
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