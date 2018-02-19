import javax.swing.*;
import java.awt.*;
/**
 * Draws a house on a white background
 *
 * @author (Tucker, Fez, Collin)
 * @version (2/18/18)
 */
public class DrawingHouse extends JPanel
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DrawingShapesPanel
     */
    public DrawingHouse()
    {
        super();
        setOpaque(true);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500,500));

    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("DrawingHouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        DrawingHouse panel = new DrawingHouse();
        frame.getContentPane().add(panel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }

    @Override
    public void paintComponent(Graphics g)
    {
        // As we learned in the last lesson,
        // the origin (0,0) is at the upper left corner.
        // x increases to the right, and y increases downward.
        super.paintComponent(g);
        Color lightBlue = new Color(0, 150, 255); // the sky
        g.setColor(lightBlue);
        g.drawRect(0, 0, 500, 250);
        g.fillRect(0, 0, 500, 250);
        
        g.setColor(Color.YELLOW); // the sun
        g.drawOval(30, 50, 50, 50);
        g.fillOval(30, 50, 50, 50);
        
        g.setColor(Color.BLACK); // house rectangle
        g.drawRect(275, 175, 125, 125);
        g.fillRect(275, 175, 125, 125);
        
        g.setColor(Color.WHITE); // windows and window panes
        g.drawRect(290, 200, 30, 40);
        g.drawRect(350, 200, 30, 40);
        g.drawRect(350, 200, 15, 20);
        g.drawRect(365, 200, 15, 20);
        g.drawRect(350, 220, 15, 20);
        g.drawRect(365, 220, 15, 20);
        g.drawRect(290, 200, 15, 20);
        g.drawRect(305, 200, 15, 20);
        g.drawRect(305, 220, 15, 20);
        g.drawRect(290, 220, 15, 20);
        
        int[] triCoordX = {270, 405, 338};
        int[] triCoordY = {175, 175, 145};
        g.setColor(Color.GREEN);
        g.drawPolygon(triCoordX, triCoordY, 3);
        g.fillPolygon(triCoordX, triCoordY, 3);
    }
}
