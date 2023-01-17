import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Background extends JComponent implements Runnable
{
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawBackground(Graphics2D page)
    {   
        page.setColor(Color.green);
        page.fillRoundRect(-100,230,350,400,50,50);
        page.fillRoundRect(220,200,300,400,50,50);
        page.fillRoundRect(500,280,300,400,50,50);
        page.setColor(new Color(210, 180, 140));
        page.fillRoundRect(-100,250,350,400,50,50);
        page.fillRoundRect(220,220,300,400,50,50);
        page.fillRoundRect(500,300,300,400,50,50);
    }
    
    public void run()
    {
    
    }
}