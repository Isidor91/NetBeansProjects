package brojacnitiprimer;
public class Nit extends Thread
{
    private Counter c;
    public Nit(Counter c) 
    {
       this.c = c;
       start();
    }
    @Override
    public void run()
    {
        synchronized(c)
        {
            c.uvecaj();
        }
        //c.uvecaj2();
        //c.uvecaj3();
    }
}
