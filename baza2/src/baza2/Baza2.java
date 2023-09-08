
package baza2;
import java.sql.*;
public class Baza2 
{
      public static void main(String[] args) 
      {
          try
          {
           Usluge us = new Usluge();
           us.listajKorisnikeProc();
          
           
           
          }
          catch (SQLException ex){
          System.out.println(ex.getMessage());
          }
      }
    
}
