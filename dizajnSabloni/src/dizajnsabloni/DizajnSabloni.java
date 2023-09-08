package dizajnsabloni;
public class DizajnSabloni 
{
       public static void main(String[] args) 
    {
        MyClass a = MyClass.getInstance();
        MyClass b = MyClass.getInstance();
        System.out.println(a.equals(b));
        a.x = 100;
        b.x = 25;
        System.out.println(a.x);
    }
    
}
