import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SunMoon extends JComponent
{
    private double theta = Math.PI/2;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawSun(Graphics2D page)
    {
        page.setColor(Color.yellow);
        page.fillOval((int)(350 * Math.sin(theta)) + 370, (int)(200 * Math.cos(theta)) + 210, 50, 50);
        theta += Math.PI/300;
    }
    
    public double getTheta()
    {
        return theta;
    }
}
