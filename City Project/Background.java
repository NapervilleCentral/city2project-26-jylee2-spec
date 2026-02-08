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
public class Background extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x,y,w,h, time = 0, max = 180;

    /**
     * Constructor for objects of class Floor
     */
    public Background(int x,int y,int w,int h)
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
          Color Daytime = new Color(102,153,204);
          page.setColor(Daytime); // makes road
          page.fillRect(x,y,w,h);
          for (int d = 30; d <= max; d += 30)
              {
                  int count = 0;
                  if (time == d && count % 2 == 0)
                  {
                      page.setColor(Color.black);
                  }
                  else if (time == d && count % 2 == 1)
                  {
                      page.setColor(Daytime);
                  }
                  count++;
              }
       }
       
    public void run()
    {
        int count = 0;
        /*
       while (true)
       {
           if (count%2 == 0)
           {
            this.x += 10;}
            else
            this.x -= 10;
            count ++;
            try{
                Thread.sleep(17); // 36 fps
            }catch (Exception e){}
            

        } */
    }
  
}

