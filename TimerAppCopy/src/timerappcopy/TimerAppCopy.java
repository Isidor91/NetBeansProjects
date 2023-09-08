package timerappcopy;

import java.awt.Color;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class TimerAppCopy 
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() 
        {  
            public void run() {  
            stMenu();  
        }  
        });  
   }  
     
  private static void stMenu() 
  {  
   if (!SystemTray.isSupported()) 
   {  
      System.out.println("SystemTray is not supported");  
      return;  
    }  
    PopupMenu pm = new PopupMenu();  
    MenuItem pmClose = new MenuItem("Close");       
    MenuItem pmSet = new MenuItem("Settings");  
       
    pmClose.addActionListener(new ActionListener() {  
        @Override  
        public void actionPerformed(ActionEvent e) {  
          System.exit(0);  
        }  

             });  
      pmSet.addActionListener(new ActionListener() {  
        @Override  
       public void actionPerformed(ActionEvent e) {  
         SetFrame frame = new SetFrame();  
         frame.setSize(500, 400);  
         frame.setLocation(100, 200);  
         ImageIcon ii = new ImageIcon("rgb.png");  
         frame.setIconImage(ii.getImage());  
         frame.getContentPane().setBackground(new Color(44, 62, 80));  
         frame.setVisible(true);  
        }  
      });  
       
     pm.add(pmClose);  
    pm.add(pmSet);  
       
     SystemTray st = SystemTray.getSystemTray();  
     try {  
       Image img = ImageIO.read(new File("rgb.png"));  
       ico.setImageAutoSize(true);  
       ico.setToolTip("Assignment");  
       ico.setPopupMenu(pm);  
       st.add(ico);  
    } 
     catch (Exception e) 
    {  
       JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());  
      }  
    }
    
}
