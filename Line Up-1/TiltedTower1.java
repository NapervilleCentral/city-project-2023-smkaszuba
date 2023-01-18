import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class TiltedTower1 extends JComponent
{
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(new Color(155, 150, 140));
        page.fillRect(30,100,200,300);
    }
}