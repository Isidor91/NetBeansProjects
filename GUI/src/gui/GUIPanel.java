package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class GUIPanel extends JPanel
{
    private JButton dugme1,dugme2;
    private JButton niz[];
    private JTextArea oblast;
    private Nit nit;
    
    public GUIPanel(int n) 
    {
        this.nit = nit;
        setBackground (Color.green);
        setPreferredSize(new Dimension(500,300));
        dugme1 = new JButton("Kreni");
        dugme2 = new JButton("Stani"); 
        Osluskivac o1 = new Osluskivac();
        Osluskivac2 m1 = new Osluskivac2();
        add(dugme1);
        dugme1.addActionListener(o1);
        dugme1.addMouseListener(m1);
        add(dugme2);  
        dugme2.addActionListener(o1);
        dugme2.addMouseListener(m1);
        oblast = new JTextArea(20,20);
        add(oblast);
        
        niz = new JButton[n];
        /*for(int i = 0;i<niz.length;i++)
        {
            niz[i] = new JButton("Dugme "+(i+1));
            add(niz[i]);
            niz[i].addActionListener(o1);
            niz[i].addMouseListener(m1);
        }  */                    
    }
    private class Osluskivac2 implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mis");
        }

        @Override
        public void mousePressed(MouseEvent e) {
          
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
    }
    }

    public JTextArea getOblast() 
    {
        return oblast;
    }

    public void setNit(Nit nit) 
    {
        this.nit = nit;
    }
    
    private class Osluskivac implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            System.out.println("Klik!");
            if(((JButton)e.getSource())== dugme1)
            {
                System.out.println("Kliknuto dugme 1");
                nit.kreni();                
            }
            if(((JButton)e.getSource())== dugme2)
            {
                System.out.println("Kliknuto na dugme 2");
                //oblast.setText("Stalo je.");
                nit.zaustavi();
            }
            for(JButton dugme:niz)
                if(((JButton)e.getSource())== dugme)
                    System.out.println("Kliknuto na dugme " + dugme.getText());
                
        }        
    }

}