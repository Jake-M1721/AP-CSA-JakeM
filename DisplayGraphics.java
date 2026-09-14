package displaygraphics;

import java.awt.*;
import javax.swing.*;


public class DisplayGraphics extends JPanel{
  
  //this is a constructor method.
  public DisplayGraphics(){
    super();
  }
  
    /* Create a paintComponent() method to override the one in
    JPanel.This is where the drawing happens. We don't have 
    to call it in our program, it gets called automatically 
    whenever the panel needs to be redrawn, like when it is 
    made visible or moved or whatever.
  */
  public void paintComponent(Graphics g){
    final int MID = 150;
    final int TOP = 50;
    g.setColor(Color.cyan);
    g.fillRect(0,0,300,225);
    g.setColor(Color.darkGray); //set the graphics object's paint color
    //for next action
    g.fillRect(0, 175, 300, 50); // ground
    g.setColor(Color.red); //restting paint color
   
    g.fillOval(-40, -40, 80, 80); // sun
    
    g.drawLine(0, 0, MID-40, TOP);
    g.drawLine(0, 0, MID-30, TOP+20);
    
    g.setColor(Color.white); //resetting paint color
    g.fillOval(MID-20, TOP, 40, 40);// head
    g.fillOval(MID-35, TOP+35, 70, 50); // upper torso
    g.fillOval(MID-50, TOP+80, 100, 60); // lower torso
    g.setColor(Color.blue);
    g.fillOval(MID-10, TOP+10, 5, 5); // left eye
    g.fillOval(MID+5, TOP+10, 5, 5);// right eye
    g.drawArc(MID-10, TOP+20, 20, 10, 190, 160); // smile
    g.drawLine(MID-25, TOP+60, MID-50, TOP+40); // left arm
    g.drawLine(MID+25, TOP+60, MID+55, TOP+60); // right arm
    g.drawLine(MID-20, TOP+5, MID+20, TOP+5); // brim of hat
    g.fillRect(MID-15, TOP-20, 30, 25);// top of hat
    g.setColor(Color.GREEN);
    g.fillPolygon(new int[] {175, 220, 275}, new int[] {200, 20, 200}, 3);
    g.setColor(Color.red);
    g.fillOval(212, 50, 10, 10); // ornament 
    g.fillOval(220, 70, 10, 10);
    g.fillOval(205, 90, 10, 10);
    g.fillOval(220, 125, 10, 10);
    g.setColor(Color.yellow);
   
    g.fillOval(200, MID-25, 10, 10);
    g.fillOval(205, 150, 10, 10);
    g.fillOval(200, 125, 10, 10);
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        //create a new JFrame object, initialize
        JFrame frame = new JFrame("Display Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // Create a new identifier for a Basic JPanel (DisplayGraphics) called "panel",
        // then create a new BasicJPanel object for it to refer to.
        DisplayGraphics panel = new DisplayGraphics();

        // Make the panel object the content pane of the JFrame.
        // This puts it into the drawable area of frame, and now
        // we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
}