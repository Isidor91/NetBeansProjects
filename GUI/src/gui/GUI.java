package gui;
import javax.swing.JFrame;
public class GUI 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("GUI niti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        GUIPanel panel = new GUIPanel(5);
        Nit nit = new Nit(panel.getOblast());
        panel.setNit(nit);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }   
}
