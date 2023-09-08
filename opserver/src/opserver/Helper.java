package opserver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class Helper 
{
  private Connection conn; 
  private Statement st;
  private ArrayList<Product> list;
  private PreparedStatement pst;

    public Helper() throws SQLException 
    {
        conn = Connect.ConnectToDtbs();
        st = conn.createStatement();
        list = new ArrayList();
    }
    public void UpdatePrice(int oldPrice,int newPrice) throws SQLException
    {
        pst = conn.prepareStatement("update product set price=? where price= ?");
        pst.setInt(1, newPrice);
        pst.setInt(2, oldPrice);
        pst.execute();
        pst.close();                 
    }
    public void inform (int price) throws SQLException
    {
            pst = conn.prepareStatement
            ("insert into product values (null,?)");
            pst.setInt(1, price);
            pst.execute();
            pst.close();
    }

  
    
  
}
