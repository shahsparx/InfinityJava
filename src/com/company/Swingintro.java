//Paint lines to a panel
package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
 * Created by Lenovo on 07-10-2015.
 */
public class Swingintro extends JPanel{
    Insets ins;  //holds the panel's insets
    Random rand; //used to generate random numbers

    //Construct a panel
    Swingintro()
    {
        //Put a border around the panel
        setBorder(BorderFactory.createLineBorder(Color.red,5));

        rand = new Random();

    }

    //Override the paintComponent () method
    protected void paintComponent(Graphics g)
    {
        //Always call the superclass method first.
        super.paintComponent(g);

        int x,y,x2,y2;

        //Get the height and width of the component

        int height = getHeight();
        int width = getWidth();

        //Get the insets
        ins= getInsets();

        //Draw ten lines whose endpoints are randomly generated.
        for(int i= 0; i<10;i++)
        {
            //Obtain random coordinates that define the endpoints of each line.
            x=rand.nextInt(width-ins.left);
            y=rand.nextInt(height-ins.bottom);
            x2=rand.nextInt(width-ins.left);
            y2=rand.nextInt(height-ins.bottom);

            //Draw a line
            g.drawLine(x,y,x2,y2);

        }

    }

}

//Demonstrate painting directly onto a panel

class PaintDemo{

    JLabel jlab;
    Swingintro pp;

    PaintDemo() {
        //Create a new JFrame container
        JFrame jfrm = new JFrame("Paint Demo");

        //Give the frame an initial size
        jfrm.setSize(200, 150);

        //Terminate the program when tge user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create the panel that will be painted.
        pp = new Swingintro();

        //Add the panel to the content pane.Because the default border layout is used, the panel will automatically be sized
        //to fit the center region
        jfrm.add(pp);

        //Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[])
    {
        //Create the frame on the eent dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });

    }
}

