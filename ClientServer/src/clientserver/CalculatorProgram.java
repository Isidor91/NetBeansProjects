package clientserver;
import java.net.ServerSocket;
public class CalculatorProgram 
{
    public static void main(String[] args) 
    {   
        try
        {
            Server server = new Server(new ServerSocket(5000));
            Client client = new Client(5000);
            server.start();
            client.StartClient();
        }      
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
