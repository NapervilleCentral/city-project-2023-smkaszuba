import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private SunMoon sunmoon = new SunMoon();
    private Background background = new Background();
    private Sky sky = new Sky();
    TiltedTower1 clockTower = new TiltedTower1();
    TiltedTower2 tower1 = new TiltedTower2();
    TiltedTower3 tower2 = new TiltedTower3();
    Jonesy player = new Jonesy();
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent()
    {
        Thread t1 = new Thread(sunmoon);
        Thread t3 = new Thread(sky);
        t1.start();
        t3.start();
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        sky.draw(g2);
        sunmoon.draw(g2);
        background.draw(g2);
        clockTower.draw(g2);
        tower1.draw(g2);
        tower2.draw(g2);
        player.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sky.nextFrame();
        sunmoon.nextFrame();
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
