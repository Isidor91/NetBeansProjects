package opserver;

import java.sql.SQLException;

public class Opserver 
{
    public static void main(String[] args) throws SQLException 
    {
      /*Subject s = new Subject(50);
      Product p1 = new UpdatedPrice(20,s);
      s.show();*/
      Helper h = new Helper();
      //h.inform(20);
      h.UpdatePrice(100, 50);
      
      
    }
    
}
