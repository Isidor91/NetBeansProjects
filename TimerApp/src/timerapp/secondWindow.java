/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timerapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author isidor
 */
public class secondWindow extends JPanel{
    
     private Timer tm;
     JFrame frame = new JFrame();
  
    public secondWindow(Color c, int delay)
    {
        frame.setSize(500,400);
        delay = 1000 * delay;
        //System.out.println("delay: " + delay);
        tm = new Timer((int)delay, new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {               
                Color blink = frame.getContentPane().getBackground();
                if(blink.equals(c))
                {
                    frame.getContentPane().setBackground(Color.WHITE);
                }
                else
                {
                    frame.getContentPane().setBackground(c);
                }                   
         }
       });
       tm.start();
       frame.setVisible(true);
    }
    
    public JFrame getFrame()
    {
        return frame;
    }

}
