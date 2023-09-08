package datumivreme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
public class DatumIVreme 
{
        
        static JFrame frame;    
        static Integer elapsed;

    public static void main(String[] args) 
    {
       frame = new JFrame();
       frame.setSize(400, 300);
        
        elapsed = 0;
                       
        Timer timer = new Timer(1,new ActionListener()
        {                                                           
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.setTitle("Time elapsed:"+(elapsed++).toString());
            }     
               
        });       
        timer.start();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    }
    
}
