//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Lineup is your city - add objects such as building, road, cars, etc
//********************************************************************

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class LineUp extends JComponent //implements Runnable
{
   //private final int APPLET_WIDTH = 400;    //Size constants
   //private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
   //Graphics page;

   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   
   // defining "object" to your city
   private Objects figure1,figure2, figure3, figure4;
   private Floor ground;
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public LineUp () //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of stick figures

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);

      ground = new Floor(50, 120, 200, 60); // makes cement road 
      
      figure1 =  new Objects (100, 150, Color.red, h1); // building on the left
      figure2 =  new Objects (100, 150, Color.red, h2); // building in the middle
      figure3 =  new Objects (100, 150, Color.red, h3); // building on the right
      figure4 =  new Objects (100, 150, Color.red, h4); // Side walk in between buildings and road
      
      Thread t1 = new Thread(ground);
      t1.start();
      
      //x, y, color, height
      
      //setBackground (Color.black); //sets the color of background
      //setSize (600, 800); //Sets up applet window

      //figure2.draw(page);


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures Graphics Page - call from component
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        // this is the graphics to draw your objects
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
      ground.draw(page); // oder of drawing matters, shift position
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      //ground.draw(page);

      //Thread t1 = new Thread(ground);
      //t1.start();

    
   }

   public void nextFrame()
   {


       repaint();

   }

   public void run()
   {
    }
}
