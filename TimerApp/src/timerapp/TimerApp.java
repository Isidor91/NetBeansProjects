package timerapp;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TimerApp 
{
    public static void main(String[] args) throws ParseException 
    {
        int yourSide = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Close"}, null);

        switch(yourSide)
        {
            case JOptionPane.YES_OPTION:
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            firstWindow fw = new firstWindow();
            
            frame.getContentPane().add(fw);
            frame.pack();
            frame.setVisible(true);
                   
            break;
            case JOptionPane.CANCEL_OPTION:
                
            break;
        }
        
    }    
}
