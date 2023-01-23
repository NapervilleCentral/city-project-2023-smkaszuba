import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import java.awt.image.BufferedImage;

public class Jonesy extends JComponent implements Runnable
{
    private int x, y = -30, a, p;
    private double theta;
    private static Random random = new Random();
    private BufferedImage jonesy;
    private Rectangle clockTower, jonesyCoords, road;
    private Polygon clockTowerRoof;
    
    public Jonesy(Rectangle hitbox1, Polygon hitbox2, Rectangle hitbox3)
    {
        try
        {
            jonesy = ImageIO.read(new File("banan.png"));
            jonesyCoords = new Rectangle(x, y, 30, 30);
        }
        catch(IOException e) {}
        
        x = (int) random.nextInt(1000);
        a = (int) random.nextInt(200) - 100;
        p = (int) random.nextInt(15) - 5;
        clockTower = hitbox1;
        clockTowerRoof = hitbox2;
        road = hitbox3;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // invoke the draw method 
        draw(g2);
    }
    
    public void nextFrame()
    {
        repaint();
    }
    
    public void draw(Graphics2D page)
    {   
        page.drawImage(jonesy, (int) (a * Math.sin(theta * p)) + x, y, 30, 30, null);
    }
    
    public void run()
    {
        try
        {    
            Thread.sleep(random.nextInt(3000));
        }
        catch (Exception e){}
        while(true)
        {  
            if (clockTower.intersects(jonesyCoords) ||
                road.intersects(jonesyCoords))
            {
                try
            {    
            Thread.sleep(1000);
            }
            catch (Exception e){}
            x = (int) random.nextInt(1000);
            y = -30;             
            }
            else
            {
                ++y;
                theta += Math.PI/200;
            }
            
            jonesyCoords = new Rectangle(x, y, 30, 30);
            try
               {    
                   Thread.sleep(17);
               }
               catch (Exception e){}
        }
    }
}