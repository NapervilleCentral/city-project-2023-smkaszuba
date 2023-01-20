import java.awt.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import java.awt.image.BufferedImage;

public class Jonesy extends JComponent implements Runnable
{
    private int x, y = -30, w, h, a, p;
    private double theta;
    private static Random random = new Random();
    private BufferedImage jonesy;
    
    public Jonesy()
    {
        try
        {
            jonesy = ImageIO.read(new File("banan.png"));   
        }
        catch(IOException e) {}
        
        x = (int) random.nextInt(500) + 200;
        a = (int) random.nextInt(200) - 100;
        p = (int) random.nextInt(10);
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
        while(true)
        {  
            //if (page.hitClip(70,200,100,250))
            //{
            //    x = 10;
            //    y = 10;
           // }
            //else
           // {
           //     ++y;
           //     theta += Math.PI/200;
           // }
            ++y;
                theta += Math.PI/200;
            
            
            try
               {    
                   Thread.sleep(17);
               }
               catch (Exception e){}
        }
    }
}