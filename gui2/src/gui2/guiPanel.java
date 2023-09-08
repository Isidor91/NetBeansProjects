package gui2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class guiPanel extends JPanel
{
    JButton btn,btn2,btn3,btn4,btn5;
    public guiPanel() 
    {     
        this.setPreferredSize(new Dimension (600,500));
        this.setLayout(new BorderLayout());
          btn = new JButton("Button 1 (PAGE_START)");
        add(btn,BorderLayout.PAGE_START);
           btn2 = new JButton("Button 2 (PAGE_END)");
        add(btn2,BorderLayout.PAGE_END);
           btn3 = new JButton("Button 3 (CENTER)");
        add(btn3,BorderLayout.CENTER);
           btn4 = new JButton("Button 4 (LINE_START)");
        add(btn4,BorderLayout.LINE_START);
           btn5 = new JButton("Button 5 (LINE_END)");
        add(btn5,BorderLayout.LINE_END);
        btn.addActionListener(new Osluskivac());
        btn2.addActionListener(new Osluskivac()); 
        btn3.addActionListener(new Osluskivac());
        btn4.addActionListener(new Osluskivac());
        btn5.addActionListener(new Osluskivac());
    }       
    private class Osluskivac implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String ime = ((JButton)e.getSource()).getText();
            System.out.println(ime);
           switch(ime)
           {
               case "Button 1 (PAGE_START)":
                   btn3.setBackground(Color.red);break;
               case "Button 2 (PAGE_END)":
                   btn3.setBackground(Color.blue);break;
               case "Button 3 (CENTER)":
                   btn3.setBackground(Color.green);break;
               case"Button 4 (LINE_START)":
                   btn3.setBackground(Color.yellow);break;
               case"Button 5 (LINE_END)":
                   btn3.setBackground(Color.GRAY);break;
               default:
                   btn3.setBackground(Color.orange);
                       
           }
        }
    }
}
