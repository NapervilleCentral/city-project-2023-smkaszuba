import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class TiltedTower3 extends JComponent
{
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.setColor(new Color(207, 185, 151));
        page.fillRect(650,220,300,230);
    }
}