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
public class Windows extends JComponent implements Runnable
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
    public Windows(int x,int y,int w,int h)
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
          int flash;
          Random chance = new Random ();
          flash = chance.nextInt(101);
          Color window = new Color(212, 208, 200);
          if (time <= 60 || time >= 121)
              page.setColor(window);
          
          
          if (time >= 61 && time <= 120) // THIS DOES WORK now figure out how to time with day night cycle
          {
              page.setColor(Color.yellow);
              if (flash %2 == 0)
                  page.setColor(window);
          }
          
          page.fillRect(x,y,w,h);
          
          // creates windows in right most building
          for (int count = 0 ; count <= 3; count++)
          {
            if (count == 3)
            {
             x = 580;
            }
            page.fillRect(x,y,w,h);
            x += 50;
          }
          x1 = 580;
          y1 = 335;
          w1 = 25;
          h1 = 20;
          for (int count = 0 ; count <= 3; count++)
          {
              page.fillRect(x1, y1, w1, h1);
              x1 += 50;
            
          }
          // creates windows in middle building
          x2 = 490;
          y2 = 300;
          w2 = 25;
          h2 = 20;
          for (int count = 0; count <= 1; count++)
          {
          
              page.fillRect(x2,y2,w2,h2);
              y2 += 45;
              
          }
          // windows in the left building
          x3 = 360;
          y3 = 330;
          w3 = 25;
          h3 = 20;
          for (int count = 0; count <= 1; count++)
          {
          
              page.fillRect(x3, y3, w3, h3);
              x3 += 40;
          }
          
          x4 = 360;
          y4 = 375;
          w4 = 25;
          h4 = 20;
          for (int count = 0; count <= 1; count++)
          {
              
              page.fillRect(x4, y4, w4, h4);
              x4 += 40;
          }
          time++;
       }
    
       
    public void run()
    {
        
       
    }
  
}

