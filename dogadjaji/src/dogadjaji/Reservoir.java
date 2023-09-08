package dogadjaji;
import java.util.ArrayList;
import java.util.Iterator;
public class Reservoir 
{
    private ArrayList<ReservoirListener> allListeners = new ArrayList<>();
    private String status = "Full";
    public void fillRes()
    {
        this.status = "Full";
        resEvent();
    }
    public void emptyRes()
    {
        this.status = "Empty";
        resEvent();
    }
    
    public synchronized void addResListener(ReservoirListener r1)
    {
        allListeners.add(r1);
    }
    public synchronized void removeResListener(ReservoirListener r1)
    {
        allListeners.remove(r1);
    }
    private synchronized void resEvent()
    {
        Dogadjaji event1 = new Dogadjaji( this,status );
        Iterator Listeners = allListeners.iterator();
        while(Listeners.hasNext())
        {
           ((ReservoirListener) Listeners.next()).statusChanged(event1);
        }
    }
}
