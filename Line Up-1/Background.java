import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class Background extends JComponent
{
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawBackground(Graphics2D page)
    {
        page.setColor(Color.cyan);
        page.fillRect(0,0,1920,1080);
    }
}