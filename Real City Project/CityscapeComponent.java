import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.*;
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
    private TiltedTower1 clockTower = new TiltedTower1();
    private TiltedTower2 tower1 = new TiltedTower2();
    private TiltedTower3 tower2 = new TiltedTower3();
    private Polygon clockTowerRoof = clockTower.getRoof();
    private Rectangle clockTowerTop = clockTower.getTower(), road = background.getRoad(),
            roof1 = tower1.getRoof1(), roof2 = tower1.getRoof2(), roof3 = tower1.getRoof3(),
            roof4 = tower2.getRoof();
    private Jonesy player1 = new Jonesy(clockTowerTop, clockTowerRoof, road, roof1, roof2, roof3, roof4);
    private Jonesy player2 = new Jonesy(clockTowerTop, clockTowerRoof, road, roof1, roof2, roof3, roof4);
    private Jonesy player3 = new Jonesy(clockTowerTop, clockTowerRoof, road, roof1, roof2, roof3, roof4);
    private Jonesy player4 = new Jonesy(clockTowerTop, clockTowerRoof, road, roof1, roof2, roof3, roof4);
    private Jonesy player5 = new Jonesy(clockTowerTop, clockTowerRoof, road, roof1, roof2, roof3, roof4);
    private Window window = new Window();
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent()
    {
        Thread t1 = new Thread(sunmoon);
        Thread t2 = new Thread(sky);
        Thread t3 = new Thread(player1);
        Thread t4 = new Thread(player2);
        Thread t5 = new Thread(player3);
        Thread t6 = new Thread(player4);
        Thread t7 = new Thread(player5);
        Thread t8 = new Thread(window);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
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
        player1.draw(g2);
        player2.draw(g2);
        player3.draw(g2);
        player4.draw(g2);
        player5.draw(g2);
        window.draw(g2);
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
        player1.nextFrame();
        player2.nextFrame();
        player3.nextFrame();
        player4.nextFrame();
        player5.nextFrame();
        window.nextFrame();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
