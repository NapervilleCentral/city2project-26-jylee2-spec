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
public class Buildings extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int x,y,w,h;

    /**
     * Constructor for objects of class Floor
     */
    public Buildings(int x,int y,int w,int h)
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
          
          // Left most building
          Color brick = new Color(188, 74, 60);
          page.setColor(brick);
          page.fillRect(350, 515, 85, 95);
          
          // Middle building
          Color officegrey = new Color(90,91,93);
          page.setColor(officegrey);
          page.fillRect(475, 490, 55, 120);
          // Right most building
          
          page.fillRect(x,y,w,h);
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

