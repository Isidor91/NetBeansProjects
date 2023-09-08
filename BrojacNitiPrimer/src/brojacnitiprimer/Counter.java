package brojacnitiprimer;
public class Counter 
{
    private int count;
    public void uvecaj()
    {
       for(int i = 1;i<=100000;i++)
           count++;
    }
    public synchronized void uvecaj2()
    {
        for(int i = 1;i<=100000;i++)
            count++;
    }
    public void uvecaj3()
    {   for(int i = 1;i<=100000;i++)
        synchronized (this)
        {  
            count++;        
        }
    }
    @Override
    public String toString() {
        return "Counter{" + "count=" + count + '}';
    }
    
}
