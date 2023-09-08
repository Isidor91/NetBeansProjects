package clientserver;
import java.io.*; 
import java.net.*; 
public class Server extends Thread
{ 
    public ServerSocket serverSocket;
    
    public Server(ServerSocket serverSocket)
    {
       this.serverSocket=serverSocket;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Server is waiting for client");
                Socket s = serverSocket.accept();
                System.out.println("Client found..."+ s.getLocalAddress());
                DataOutputStream out = new DataOutputStream(s.getOutputStream());
                DataInputStream in = new DataInputStream(s.getInputStream());
                
                int a = in.readInt();
                int b = in.readInt();
                int answer = a + b;
                out.writeInt(answer);
                
                s.close();
            }
            catch(IOException ex)
            {
                System.out.println("Error in server.Java");
                ex.printStackTrace();
                System.out.println(ex.toString());
            }
        }
    }
  
    

}     
