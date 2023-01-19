import java.awt.*;
import java.util.*;
import javax.swing.JComponent;

public class TiltedTower2 extends JComponent
{
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
}