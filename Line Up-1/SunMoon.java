import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
public class SunMoon extends JComponent
{
    private Color color;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void drawSun(Graphics2D page)
    {
        page.setColor(java.awt.black);
        page.fillOval(50, 50, 50, 50);
    }
}
