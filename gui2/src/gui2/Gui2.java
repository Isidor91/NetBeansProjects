package gui2;
import javax.swing.JFrame;
public class Gui2 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("GUI2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiPanel panel = new guiPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
