package dizajnsabloni;
public class MyClass 
{
    public int x;
    static MyClass instance;
    private MyClass() 
    {
        
    }
    public static MyClass getInstance()
    {
        if(MyClass.instance==null)
            instance = new MyClass();
            return instance;
        
    }
    
}
