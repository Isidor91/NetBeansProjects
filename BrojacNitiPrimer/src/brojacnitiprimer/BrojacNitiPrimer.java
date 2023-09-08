package brojacnitiprimer;
public class BrojacNitiPrimer 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter counter = new Counter();
        Nit n1 = new Nit(counter);
        Nit n2 = new Nit(counter);
        Thread.sleep(3000);
        System.out.println(counter);
    }
    
}
