package dogadjaji;
public class resEventListener implements ReservoirListener 
{
    public void statusChanged(Dogadjaji event)
    {
        System.out.println("Reservoir status : " + event.msg);
    }
    
}
