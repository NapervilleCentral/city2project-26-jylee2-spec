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
    // 
    

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
          int count = 1;
          page.setColor(Color.yellow);
          // 7 seconds before setting shift
          if(time >= 60 && time <= 120)
          {
                page.setColor(Color.white);
          }
          if (time == 60)
          {
              x = 150;
              y = 270;
          }
          if (time == 120)
          {
              x = 150;
              y = 270;
          }
          if (time >= 120 && time <= 180)
          {
              page.setColor(Color.yellow);  
          }
          
          page.fillOval(x, y, w, h);
          
          if (x <= 475)
          {
              x+= 13;
              y-= 6;
          }
          if (x >= 475)
          {
             x += 13;
             y += 5;
          }
          
          
          
          time ++;
       }
    
       
    public void run()
    {
        
       
    }
  
}

