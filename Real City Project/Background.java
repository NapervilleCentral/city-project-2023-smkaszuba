import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class Background extends JComponent
{
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(Color.green);
        page.fillRoundRect(-100,230,350,400,50,50);
        page.fillRoundRect(220,200,300,400,50,50);
        page.fillRoundRect(500,280,700,400,50,50);
        page.setColor(new Color(101, 67, 33));
        page.fillRoundRect(-100,250,350,400,50,50);
        page.fillRoundRect(220,220,300,400,50,50);
        page.fillRoundRect(500,300,700,400,50,50);
        page.setColor(Color.lightGray);
        page.fillRect(0,450,1000,200);
        page.setColor(Color.yellow);
        page.fillRect(30,495,75,20);
        page.fillRect(160,495,75,20);
        page.fillRect(290,495,75,20);
        page.fillRect(420,495,75,20);
        page.fillRect(540,495,75,20);
        page.fillRect(670,495,75,20);
        page.fillRect(800,495,75,20);
        page.fillRect(930,495,75,20);
    }
    
    public Rectangle getRoad()
    {
        return new Rectangle(0,450,1000,200);
    }
}