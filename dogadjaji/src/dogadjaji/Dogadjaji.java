package dogadjaji;
import java.util.EventObject;
public class Dogadjaji extends EventObject
{   
    String msg;   
    public Dogadjaji(Object source,String msg) 
    {
        super(source);
        this.msg = msg;
    }
   
}
   
    

    


