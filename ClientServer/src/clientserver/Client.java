package clientserver;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client
{ 
   public int port;
   
   public Client(int port)
   {
       this.port=port;
   }
   public void StartClient()
   {
       Frame f = new Frame();
       TextField t1 = new TextField(6);
       Label l = new Label(" + ");
       TextField t2 = new TextField(6);
       Label l1 = new Label(" = ");
       TextField t3 = new TextField(6);
       Button btn = new Button("Add");
       
       f.add(t1);
       f.add(l);
       f.add(t2);
       f.add(l1);
       f.add(t3);
       f.add(btn);       
            
       f.addWindowListener(new WindowAdapter()
       {
           @Override
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
       }
       );
       
       btn.addActionListener(new ActionListener()
       {
              @Override
              public void actionPerformed(ActionEvent e){
                  int a = Integer.parseInt(t1.getText());
                  int b = Integer.parseInt(t2.getText());

                  try(Socket clientSocket = new Socket("127.0.0.1",port))
                  {
                      DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                      DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                      
                      out.writeInt(a);
                      out.writeInt(b);
                      int answer = in.readInt();
                      t3.setText(String.valueOf(answer));
                      
                      clientSocket.close();
                  }
                  catch(Exception ex)
                  {
                      ex.printStackTrace();
                  }
              }     
       });
       f.setVisible(true);
       f.setSize(300, 300);
       f.setLayout(new FlowLayout());
      
   }
} 
