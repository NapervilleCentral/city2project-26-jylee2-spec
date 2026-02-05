import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DNcycle extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x,y,w,h;
    int time = 0;
    int x1, y1, w1, h1; // 2nd row of windows on right side
    int x2, y2, w2, h2; // window row in middle house
    int x3, y3, w3, h3; // 1st row windows in red building
    int x4, y4, w4, h4; // 2nd row windows in red building
    

    /**
     * Constructor for objects of class Floor
     */
    public DNcycle(int x,int y,int w,int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void paintComponent(Graphics g)
    {
       
        
        
    }
    
    
    
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          // choose the color and then fill object
         
          page.setColor(Color.yellow);
       }
    
       
    public void run()
    {
        
       
    }
  
}

