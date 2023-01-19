import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import java.awt.image.BufferedImage;

public class Jonesy extends JComponent
{
    private double x, y, w, h;
    BufferedImage jonesy;
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        try
        {
            jonesy = ImageIO.read(new File("banan.png"));   
        }
        catch(IOException e) {}
        
        page.drawImage(jonesy, 10,10, null);
    }
}