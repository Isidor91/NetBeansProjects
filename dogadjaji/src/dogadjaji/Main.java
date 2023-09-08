package dogadjaji;
public class Main 
{
    public static void main(String[] args) 
    {
        Reservoir res = new Reservoir();
        resEventListener res1 = new resEventListener();
        res.addResListener(res1);
        res.fillRes();
        res.emptyRes();
        
    }
}
