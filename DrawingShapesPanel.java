import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class DrawingShapesApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingShapesPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DrawingShapesPanel
     */
    public DrawingShapesPanel()
    {
        super();
        //setOpaque(true);
        //setBackground(Color.BLACK);
        setPreferredSize(new Dimension(500,500));

    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("DrawingHouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        DrawingShapesPanel panel = new DrawingShapesPanel();
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
        g.setColor( Color.red );
        g.drawRect( 10, 20, 100, 15 );
        g.setColor( Color.pink );
        g.fillRoundRect( 240, 160, 40, 110, 7, 7 );

        g.setColor( Color.blue );
        g.drawOval( 50, 225, 100, 50 );
        g.setColor( Color.orange );
        g.fillOval( 225, 37, 50, 25 );

        g.setColor( Color.yellow );
        g.drawArc( 10, 110, 80, 80, 90, 180 );
        g.setColor( Color.cyan );
        g.fillArc( 140, 40, 120, 120, 90, 45 );

        g.setColor( Color.magenta );
        g.fillArc( 150, 150, 100, 100, 90, 90 );
        g.setColor( Color.black );
        g.fillArc( 160, 160, 80, 80, 90, 90 );

        g.setColor( Color.green );
        g.drawString( "Wow!", 50, 150 );

        g.setColor( Color.white );
        g.draw3DRect( 200, 350, 35, 58, true);
    }
}
