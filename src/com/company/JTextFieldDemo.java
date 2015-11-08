package com.company;

//I am demonstrating JTextFieldDemo

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
    <applet code = "JTextFieldDemo" width=300 height=50>
    </applet>
 */

/** uses swing.
 * Created by Lenovo on 08-11-2015.
 */
public class JTextFieldDemo extends JApplet{
    JTextField jtf;

    public void init()
    {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            }
            );
        }catch (Exception e)
        {

        }
    }

    private void makeGUI()
    {
        //Change to flow layout
        setLayout(new FlowLayout());

        //Add text field to content pane.
        jtf = new JTextField(15);
        add(jtf);
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Show text when user presses ENTER
                showStatus(jtf.getText());
            }
        });
    }
}
