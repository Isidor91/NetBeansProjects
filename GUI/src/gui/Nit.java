package gui;
import javax.swing.JTextArea;
public class Nit extends Thread
{
    private boolean ind;
    private String tekst = "";
    private JTextArea oblast;
    public Nit(JTextArea oblast) 
    {
        this.oblast = oblast;
        ind = false;
        start();
    }     
    public void zaustavi()
    {
        ind = false;
    }
    public synchronized void kreni()
    {
        ind = true;
        notify();
    }
    @Override
    public void run()
    {
       while(true)
       {
            if(!ind)
            {
                synchronized(this)
                {
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException ie)
                    {
                        System.out.println(ie.getMessage());
                    }
                }
               
            }
            System.out.println("Krenula je...");
            tekst+="Krenulo je\n";
            oblast.setText(tekst);
           try 
           {
               Thread.sleep(1000);
           }
           catch (InterruptedException ex) 
           {}           
       }
    }
}