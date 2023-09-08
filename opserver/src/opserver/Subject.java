package opserver;
import java.util.ArrayList;
public class Subject 
{
    ArrayList<Product>products;
    private int price;
    public Subject(int price) 
    {
        products = new ArrayList();
        this.price = price;
    }
    public int getPrice() 
    {
        return price;
    }
    public void setPrice(int price) 
    {
        this.price = price;
    }
    public void addProduct(Product p)
    {
       products.add(p);
    }
    public void inform()
    {
        for(Product p : products)           
            p.updatePrice();
    }
    public void show()
    {
        for(Product p : products)
            System.out.println(p);
    }
    
}
