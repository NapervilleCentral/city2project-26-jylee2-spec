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
          Color window = new Color(212, 208, 200);
          page.setColor(window); // makes road
          page.fillRect(x,y,w,h);
          
          for (int count = 0 ; count <= 6; count++)
          {
            if (count == 3)
            {
             x = this.x;
             y += 70;
            }
            page.fillRect(x,y,w,h);
            x += 50;
            
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

