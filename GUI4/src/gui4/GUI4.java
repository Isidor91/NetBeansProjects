package gui4;
import javax.swing.JFrame;
public class GUI4 {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Direction");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DirectionPanel());
        frame.pack();
        frame.setVisible(true);
    }
    
}
