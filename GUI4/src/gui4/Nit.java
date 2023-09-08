package gui4;
public class Nit extends Thread
{
    private DirectionPanel dp;
    public Nit(DirectionPanel dp) 
    {
        this.dp = dp;
        start();
    }
    public void run()
    {
        while(true)
        {
            dp.pokreni();
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException ex) {}
        }
    }
    
}
